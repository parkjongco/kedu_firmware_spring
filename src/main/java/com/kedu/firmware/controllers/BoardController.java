package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.BoardDTO;
import com.kedu.firmware.DTO.Board_CategoryDTO;
import com.kedu.firmware.DTO.UsersDTO;
import com.kedu.firmware.services.BoardService;
import com.kedu.firmware.services.Board_CategoryService;
import com.kedu.firmware.services.UsersService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private Board_CategoryService board_categoryService;

    @Autowired
    private HttpSession session;

    @Autowired
    private UsersService usersService;

    // 게시글 작성
    @PostMapping
    public ResponseEntity<Void> post(@RequestBody BoardDTO dto) {
        String loginID = (String) session.getAttribute("loginID");

        if (loginID == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // 로그인되지 않았으면 Unauthorized 응답
        }

        UsersDTO usersDto = usersService.findUserByCode(loginID);
        dto.setUser_seq(usersDto.getUsers_seq());
        boardService.post(dto);
        return ResponseEntity.ok().build();
    }

    // 게시글 리스트 조회
    @GetMapping
    public ResponseEntity<List<BoardDTO>> get() {
        List<BoardDTO> boards = boardService.getBoards();
        return ResponseEntity.ok(boards);
    }

    // 특정 카테고리의 게시글 조회
    @GetMapping("/{seq}")
    public ResponseEntity<List<BoardDTO>> getPostByCategory(@PathVariable int seq) {

        String loginID = (String) session.getAttribute("loginID");

        UsersDTO usersDto = usersService.findUserByCode(loginID);
        if (usersDto == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // 사용자 정보가 없으면 Unauthorized 응답
        }
        int user_seq = usersDto.getUsers_seq();

        List<BoardDTO> boardDTOList = board_categoryService.getPostsByCategory(seq, user_seq );
        return ResponseEntity.ok(boardDTOList);
    }

    // 게시글 상세 조회
    @GetMapping("/detail/{seq}")
    public ResponseEntity<BoardDTO> getBySeq(@PathVariable int seq) {
        BoardDTO board = boardService.getBoard(seq);
        long user_seq = board.getUser_seq();
        String user_name = usersService.getUserNameBySeq(user_seq);
        board.setUsers_name(user_name);
        if (board != null) {
            return ResponseEntity.ok(board);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // 게시글 삭제
    @DeleteMapping("/{seq}")
    public ResponseEntity<Void> deleteBySeq(@PathVariable int seq) {
        String loginID = (String) session.getAttribute("loginID");
        if (loginID == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // 로그인되지 않았으면 Unauthorized 응답
        }

        UsersDTO usersDto = usersService.findUserByCode(loginID);
        if (usersDto == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // 사용자 정보가 없으면 Unauthorized 응답
        }

        BoardDTO boardDto = boardService.getBoard(seq);
        if (boardDto == null) {
            return ResponseEntity.notFound().build(); // 게시글이 없으면 Not Found 응답
        }

        if (usersDto.isAdmin() || usersDto.getUsers_seq() == boardDto.getUser_seq()) {
            boardService.deleteBySeq(seq);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build(); // 권한이 없으면 Forbidden 응답
        }
    }

    // 게시글 업데이트
    @PutMapping("/{seq}")
    public ResponseEntity<Void> updateBySeq(@RequestBody BoardDTO dto, @PathVariable int seq) {
        String loginID = (String) session.getAttribute("loginID");
        if (loginID == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // 로그인되지 않았으면 Unauthorized 응답
        }

        UsersDTO usersDto = usersService.findUserByCode(loginID);
        if (usersDto == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // 사용자 정보가 없으면 Unauthorized 응답
        }

        BoardDTO boardDto = boardService.getBoard(seq);
        if (boardDto == null) {
            return ResponseEntity.notFound().build(); // 게시글이 없으면 Not Found 응답
        }

        if (usersDto.isAdmin() || usersDto.getUsers_seq() == boardDto.getUser_seq()) {
            dto.setBoard_seq(seq);
            dto.setUser_seq(usersDto.getUsers_seq()); // 권한 확인을 위해 사용자 시퀀스 설정
            boardService.updateBySeq(dto);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build(); // 권한이 없으면 Forbidden 응답
        }
    }

    // 게시글 조회수 증가
    @PutMapping("/viewCount")
    public ResponseEntity<Void> incrementViewCount(@RequestBody Map<String, Integer> body) {
        int board_Seq = body.get("board_Seq");
        boardService.incrementViewCount(board_Seq);
        return ResponseEntity.ok().build();
    }

    // 기본 카테고리의 게시글 조회
    @GetMapping("/default")
    public ResponseEntity<List<BoardDTO>> getDefaultPosts() {
        Board_CategoryDTO defaultCategory = board_categoryService.getDefaultCategory();
        if (defaultCategory != null) {
            List<BoardDTO> defaultPosts = board_categoryService.getPostsByCategory(defaultCategory.getCategory_seq(), 999999999);
            return ResponseEntity.ok(defaultPosts);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
