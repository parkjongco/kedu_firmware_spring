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
	public int getGroup_message_seq() {
		return group_message_seq;
	}
	public void setGroup_message_seq(int group_message_seq) {
		this.group_message_seq = group_message_seq;
	}
	public int getGroup_message_user_seq() {
		return group_message_user_seq;
	}
	public void setGroup_message_user_seq(int group_message_user_seq) {
		this.group_message_user_seq = group_message_user_seq;
	}
	public int getGroup_message_room_seq() {
		return group_message_room_seq;
	}
	public void setGroup_message_room_seq(int group_message_room_seq) {
		this.group_message_room_seq = group_message_room_seq;
	}
	public String getGroup_message_contents() {
		return group_message_contents;
	}
	public void setGroup_message_contents(String group_message_contents) {
		this.group_message_contents = group_message_contents;
	}
	public Timestamp getGroup_message_send_date() {
		return group_message_send_date;
	}
	public void setGroup_message_send_date(Timestamp group_message_send_date) {
		this.group_message_send_date = group_message_send_date;
	}
	
	
}
