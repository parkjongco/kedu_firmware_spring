package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrivateMessageDTO {
	private int private_message_seq;
	private int user_seq;
	private int private_message_sender;
	private int private_message_receiver_id;
	private String private_message_contents;
	private Timestamp private_message_send_date;
}
