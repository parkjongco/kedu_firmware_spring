package com.kedu.firmware.services;

import com.kedu.firmware.DAO.PrivateMessageDAO;
import com.kedu.firmware.DTO.PrivateMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivateMessageService {

    @Autowired
    private PrivateMessageDAO privateMessageDAO;

    public void saveMessage(PrivateMessageDTO message) {
        privateMessageDAO.saveMessage(message);
    }

    public List<PrivateMessageDTO> getAllMessages() {
        return privateMessageDAO.selectAll();
    }

    public PrivateMessageDTO getMessageById(int id) {
        return privateMessageDAO.selectById(id);
    }
}
