package com.kedu.firmware.services;

import com.kedu.firmware.DAO.PrivateMessageDAO;
import com.kedu.firmware.DTO.PrivateMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class PrivateMessageService {

    @Autowired
    private PrivateMessageDAO privateMessageDAO;

    /**
     * 메시지를 저장합니다.
     * @param message 저장할 메시지
     */
    public void saveMessage(PrivateMessageDTO message) {
        if (message.getSend_date() == null) {
            message.setSend_date(new Timestamp(System.currentTimeMillis())); // 현재 시간으로 전송 날짜 설정
        }
        privateMessageDAO.saveMessage(message);
    }

    /**
     * 모든 메시지를 조회합니다.
     * @return 모든 PrivateMessageDTO 객체의 리스트
     */
    public List<PrivateMessageDTO> getAllMessages() {
        return privateMessageDAO.selectAll();
    }

    /**
     * 특정 ID에 해당하는 메시지를 조회합니다.
     * @param id 조회할 메시지의 ID
     * @return 조회된 PrivateMessageDTO 객체
     */
    public PrivateMessageDTO getMessageById(int id) {
        return privateMessageDAO.selectById(id);
    }
}
