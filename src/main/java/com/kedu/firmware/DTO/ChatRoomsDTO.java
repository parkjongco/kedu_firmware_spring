package com.kedu.firmware.DTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatRoomsDTO {
	private int chat_rooms_seq;
	private int group_messages_seq;
	private int user_seq;
	private String chat_room_name;
}
