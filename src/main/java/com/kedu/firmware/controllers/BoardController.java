package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.BoardDTO;
import com.kedu.firmware.services.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    //    insert
    @PostMapping
    public ResponseEntity<Void> post(@RequestBody BoardDTO dto) {
        boardService.post(dto);
        return ResponseEntity.ok().build();
    }

    //    list
    @GetMapping
    public ResponseEntity<List<BoardDTO>> get() {
        List<BoardDTO> boards = boardService.getBoards();
        return ResponseEntity.ok(boards);
    }

    @GetMapping("/detail/{seq}")
    public ResponseEntity<BoardDTO> getBySeq(@PathVariable int seq) {
        BoardDTO board = boardService.getBoard(seq);
        if (board != null) {
            return ResponseEntity.ok(board);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
