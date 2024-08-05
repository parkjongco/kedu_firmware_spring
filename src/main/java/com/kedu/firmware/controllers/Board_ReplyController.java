package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.Board_ReplyDTO;
import com.kedu.firmware.services.Board_ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reply")
public class Board_ReplyController {

    @Autowired
    private Board_ReplyService board_replyService;

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody Board_ReplyDTO dto) {
        board_replyService.post(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{seq}")
    public ResponseEntity<List<Board_ReplyDTO>> getReplies(@PathVariable int seq) {
        List<Board_ReplyDTO> replyList = board_replyService.getBoard_ReplyList(seq);

        if (replyList != null && !replyList.isEmpty()) {
            return ResponseEntity.ok(replyList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
