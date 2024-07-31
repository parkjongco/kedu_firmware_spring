package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.PrivateMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PrivateMessageDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveMessage(PrivateMessageDTO message) {
        String sql = "INSERT INTO private_messages (sender_username, receiver_username, content, send_date) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, message.getSenderUsername(), message.getReceiverUsername(), message.getContent(), message.getSendDate());
    }
}
