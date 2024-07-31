package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatRoomsDTO {
	private int chat_rooms_seq;
	private int group_messages_seq;
	private int user_seq;
	private String chat_room_name;
	public int getChat_rooms_seq() {
		return chat_rooms_seq;
	}
	public void setChat_rooms_seq(int chat_rooms_seq) {
		this.chat_rooms_seq = chat_rooms_seq;
	}
	public int getGroup_messages_seq() {
		return group_messages_seq;
	}
	public void setGroup_messages_seq(int group_messages_seq) {
		this.group_messages_seq = group_messages_seq;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public String getChat_room_name() {
		return chat_room_name;
	}
	public void setChat_room_name(String chat_room_name) {
		this.chat_room_name = chat_room_name;
	}
	
	
}
