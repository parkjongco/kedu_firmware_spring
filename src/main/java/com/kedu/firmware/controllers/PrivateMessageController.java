package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.PrivateMessageDTO;
import com.kedu.firmware.services.PrivateMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/messages")
public class PrivateMessageController {

    private static final Logger logger = Logger.getLogger(PrivateMessageController.class.getName());

    @Autowired
    private PrivateMessageService privateMessageService;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody PrivateMessageDTO message) {
        // 메시지 유효성 검사
        if (message.getContent() == null || message.getContent().trim().isEmpty()) {
            logger.warning("빈 메시지는 전송할 수 없습니다.");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("빈 메시지는 전송할 수 없습니다.");
        }

        try {
            privateMessageService.saveMessage(message);

            // 각 사용자의 큐에 메시지 전송
            String destination = "/user/" + message.getReceiver_username() + "/queue/messages";
            messagingTemplate.convertAndSend(destination, message);

            logger.info("메시지 전송: " + message.toString());

            return ResponseEntity.ok("메시지가 성공적으로 저장되고 개인 큐로 전송되었습니다.");
        } catch (Exception e) {
            logger.severe("메시지 저장 오류: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("메시지 저장 오류: " + e.getMessage());
        }
    }

    @MessageMapping("/chat")
    public void handleChatMessage(PrivateMessageDTO message) {
        logger.info("Handle chat message received: " + message.toString());

        // 메시지 유효성 검사
        if (message.getContent() == null || message.getContent().trim().isEmpty()) {
            logger.warning("빈 메시지는 처리할 수 없습니다.");
            return;
        }

        try {
            privateMessageService.saveMessage(message);

            // 메시지를 모든 클라이언트에게 브로드캐스트
            messagingTemplate.convertAndSend("/topic/messages", message);
            logger.info("Message broadcasted to all clients");
        } catch (Exception e) {
            logger.severe("메시지 처리 오류: " + e.getMessage());
        }
    }

    @GetMapping("/chat/{sender}/{receiver}")
    public ResponseEntity<List<PrivateMessageDTO>> getMessagesBetweenParticipants(
            @PathVariable String sender,
            @PathVariable String receiver) {

        try {
            List<PrivateMessageDTO> messages = privateMessageService.getMessagesByParticipants(sender, receiver);
            return ResponseEntity.ok(messages);
        } catch (Exception e) {
            logger.severe("메시지 불러오기 오류: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
