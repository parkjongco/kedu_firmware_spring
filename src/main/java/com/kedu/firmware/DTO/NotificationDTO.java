package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationDTO {
	private int notification_seq;
	private int notification_user_seq;
	private String notification_message;
	private char notification_is_read;
	public int getNotification_seq() {
		return notification_seq;
	}
	public void setNotification_seq(int notification_seq) {
		this.notification_seq = notification_seq;
	}
	public int getNotification_user_seq() {
		return notification_user_seq;
	}
	public void setNotification_user_seq(int notification_user_seq) {
		this.notification_user_seq = notification_user_seq;
	}
	public String getNotification_message() {
		return notification_message;
	}
	public void setNotification_message(String notification_message) {
		this.notification_message = notification_message;
	}
	public char getNotification_is_read() {
		return notification_is_read;
	}
	public void setNotification_is_read(char notification_is_read) {
		this.notification_is_read = notification_is_read;
	}
	
	
}
