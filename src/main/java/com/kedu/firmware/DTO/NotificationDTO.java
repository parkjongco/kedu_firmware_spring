package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationDTO {
	private int notification_seq;
	private int notification_user_seq;
	private String notification_message;
	private char notification_is_read;
}
