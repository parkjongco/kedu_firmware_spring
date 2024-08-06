package com.kedu.firmware.services;

import com.kedu.firmware.DAO.PrivateMessageDAO;
import com.kedu.firmware.DTO.PrivateMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

// PrivateMessageService 클래스는 메시지 관련 비즈니스 로직을 처리합니다.
// DAO를 사용하여 데이터베이스와 상호작용합니다.
@Service
public class PrivateMessageService {

    @Autowired
    private PrivateMessageDAO privateMessageDAO;

    // 메시지를 저장하는 메서드
    // 메시지 전송 날짜가 설정되지 않은 경우 현재 시간을 사용합니다.
    public void saveMessage(PrivateMessageDTO message) {
        if (message.getSend_date() == null) {
            message.setSend_date(new Timestamp(System.currentTimeMillis())); // 현재 시간으로 전송 날짜 설정
        }
        privateMessageDAO.saveMessage(message);
    }

    // 모든 메시지를 조회하는 메서드
    public List<PrivateMessageDTO> getAllMessages() {
        return privateMessageDAO.selectAll();
    }

    // 특정 ID의 메시지를 조회하는 메서드
    public PrivateMessageDTO getMessageById(int id) {
        return privateMessageDAO.selectById(id);
    }

    // 특정 참여자 간의 메시지를 조회하는 메서드
    public List<PrivateMessageDTO> getMessagesByParticipants(String sender, String receiver) {
        return privateMessageDAO.selectByParticipants(sender, receiver);
    }
}
