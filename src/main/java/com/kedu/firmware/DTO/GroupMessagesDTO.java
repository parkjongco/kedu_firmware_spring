package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class GroupMessagesDTO {
	private int group_message_seq;
	private int group_message_user_seq;
	private int group_message_room_seq;
	private String group_message_contents;
	private Timestamp group_message_send_date;
}
