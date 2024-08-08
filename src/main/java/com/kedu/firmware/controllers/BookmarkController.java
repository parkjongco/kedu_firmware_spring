package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.BookmarkDTO;
import com.kedu.firmware.services.BookmarkService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/bookmark")
public class BookmarkController {

    @Autowired
    BookmarkService bookmarkService;

    @PostMapping
    public ResponseEntity<Void> addBookmark(@RequestBody BookmarkDTO dto) {
        bookmarkService.addBookmark(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<BookmarkDTO>> getBookmarks(HttpServletRequest request) throws SQLException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        List<BookmarkDTO> bookmarks = bookmarkService.getBookmarksByUsername(username);
        return ResponseEntity.status(HttpStatus.OK).body(bookmarks);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBookmark(@RequestBody int bookmark_seq) {
        bookmarkService.deleteBookmark(bookmark_seq);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/check/{board_Seq}")
//    public ResponseEntity<Boolean> checkBookmark(@PathVariable int board_Seq, @RequestParam int user_Seq) {
//        boolean isBookmarked = bookmarkService.isBookmarked(user_Seq, board_Seq);
//        return ResponseEntity.ok(isBookmarked);
//    }
}
