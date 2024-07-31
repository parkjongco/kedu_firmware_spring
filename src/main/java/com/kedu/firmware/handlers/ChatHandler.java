package com.kedu.firmware.handlers;

import com.kedu.firmware.DTO.PrivateMessageDTO;
import com.kedu.firmware.services.PrivateMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatHandler {

    @Autowired
    private PrivateMessageService privateMessageService;

    @MessageMapping("/sendMessage")
    @SendTo("/topic/public")
    public PrivateMessageDTO sendMessage(PrivateMessageDTO message) {
        privateMessageService.saveMessage(message); // 메시지 저장
        return message;
    }
}
