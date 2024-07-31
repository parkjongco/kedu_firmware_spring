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
	public int getPrivate_message_seq() {
		return private_message_seq;
	}
	public void setPrivate_message_seq(int private_message_seq) {
		this.private_message_seq = private_message_seq;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public int getPrivate_message_sender() {
		return private_message_sender;
	}
	public void setPrivate_message_sender(int private_message_sender) {
		this.private_message_sender = private_message_sender;
	}
	public int getPrivate_message_receiver_id() {
		return private_message_receiver_id;
	}
	public void setPrivate_message_receiver_id(int private_message_receiver_id) {
		this.private_message_receiver_id = private_message_receiver_id;
	}
	public String getPrivate_message_contents() {
		return private_message_contents;
	}
	public void setPrivate_message_contents(String private_message_contents) {
		this.private_message_contents = private_message_contents;
	}
	public Timestamp getPrivate_message_send_date() {
		return private_message_send_date;
	}
	public void setPrivate_message_send_date(Timestamp private_message_send_date) {
		this.private_message_send_date = private_message_send_date;
	}
	
	
}
