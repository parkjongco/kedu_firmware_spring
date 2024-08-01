package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.PrivateMessageDTO;
import com.kedu.firmware.services.PrivateMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class PrivateMessageController {

    @Autowired
    private PrivateMessageService privateMessageService;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody PrivateMessageDTO message) {
        try {
            privateMessageService.saveMessage(message);
            // WebSocket을 통해 메시지 전송
            messagingTemplate.convertAndSend("/topic/public", message);
            return ResponseEntity.ok("Message saved and broadcasted successfully");
        } catch (Exception e) {
            // Log the exception for more insights
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving message: " + e.getMessage());
        }
    }

    @MessageMapping("/sendMessage")
    @SendTo("/topic/public")
    public PrivateMessageDTO broadcastMessage(PrivateMessageDTO message) {
        privateMessageService.saveMessage(message);
        return message;
    }
}
