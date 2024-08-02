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
import java.util.logging.Logger;

@RestController
@RequestMapping("/messages")
public class PrivateMessageController {

    private static final Logger logger = Logger.getLogger(PrivateMessageController.class.getName());

    @Autowired
    private PrivateMessageService privateMessageService;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    /**
     * @param message 전송할 메시지
     * @return 작업 결과를 나타내는 ResponseEntity
     */
    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody PrivateMessageDTO message) {
        try {
            // 서비스 레이어를 통해 메시지를 저장
            privateMessageService.saveMessage(message);
            // WebSocket을 통해 모든 클라이언트에게 메시지 브로드캐스트
            messagingTemplate.convertAndSend("/topic/public", message);
            return ResponseEntity.ok("메시지가 성공적으로 저장되고 브로드캐스트되었습니다.");
        } catch (Exception e) {
            // 예외 발생 시 예외를 로그로 기록
            logger.severe("메시지 저장 오류: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("메시지 저장 오류: " + e.getMessage());
        }
    }

    /**
     * HTTP GET 엔드포인트로 모든 메시지를 조회합니다.
     * 데이터베이스에서 모든 메시지를 가져와서 응답 본문에 반환합니다.
     * @return PrivateMessageDTO 객체 리스트와 HTTP 상태 코드를 포함한 ResponseEntity
     */
    @GetMapping
    public ResponseEntity<List<PrivateMessageDTO>> getAllMessages() {
        // 데이터베이스에서 모든 메시지를 가져오기 위해 서비스 레이어 메서드를 호출
        List<PrivateMessageDTO> messages = privateMessageService.getAllMessages();
        // 메시지 리스트를 ResponseEntity로 반환하며, HTTP 상태 코드는 200 OK
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    /**
     * @param id 조회할 메시지의 ID
     * @return PrivateMessageDTO 객체 또는 HTTP 상태 코드를 포함한 ResponseEntity
     */
    @GetMapping("/{id}")
    public ResponseEntity<PrivateMessageDTO> getMessageById(@PathVariable int id) {
        // 서비스 레이어 메서드를 호출하여 ID로 메시지 조회
        PrivateMessageDTO message = privateMessageService.getMessageById(id);
        if (message != null) {
            // 메시지가 존재하면 해당 메시지를 HTTP 상태 코드 200 OK와 함께 반환
            return new ResponseEntity<>(message, HttpStatus.OK);
        } else {
            // 메시지가 존재하지 않으면 HTTP 상태 코드 404 Not Found 반환
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * WebSocket 엔드포인트로 메시지를 브로드캐스트합니다.
     * 메시지를 저장하고 연결된 모든 WebSocket 클라이언트에게 브로드캐스트합니다.
     * @param message 브로드캐스트할 메시지
     * @return 브로드캐스트된 메시지
     */
    @MessageMapping("/sendMessage")
    @SendTo("/topic/public")
    public PrivateMessageDTO broadcastMessage(PrivateMessageDTO message) {
        // 서비스 레이어를 통해 메시지를 저장
        privateMessageService.saveMessage(message);
        // WebSocket을 통해 메시지를 모든 구독자에게 전송
        return message;
    }
}
