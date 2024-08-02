package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.Board_ReplyDTO;
import com.kedu.firmware.services.Board_ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
