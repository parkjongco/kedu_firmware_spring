package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.NoticeDTO;
import com.kedu.firmware.services.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    //    insert
    @PostMapping
    public ResponseEntity<Void> post(@RequestBody NoticeDTO dto) {
        noticeService.post(dto);
        return ResponseEntity.ok().build();
    }

    //    list
    @GetMapping
    public ResponseEntity<List<NoticeDTO>> get() {
        List<NoticeDTO> notices = noticeService.getNotices();
        return ResponseEntity.ok(notices);
    }

   

}
