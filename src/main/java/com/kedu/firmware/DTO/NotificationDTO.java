package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDTO {
	private int notification_seq;
	private int notification_user_seq;
	private String notification_message;
	private char notification_is_read;
}
