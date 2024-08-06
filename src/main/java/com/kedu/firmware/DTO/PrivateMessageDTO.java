package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class PrivateMessageDTO {
	private int private_message_seq;
	private int user_seq;
	private int private_message_sender;
	private int private_message_receiver_id;
	private String private_message_contents;
	private Timestamp private_message_send_date;
}
