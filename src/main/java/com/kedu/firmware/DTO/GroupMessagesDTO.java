package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupMessagesDTO {
	private int group_message_seq;
	private int group_message_user_seq;
	private int group_message_room_seq;
	private String group_message_contents;
	private Timestamp group_message_send_date;
}
