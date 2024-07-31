package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserStatusDTO {
	private int user_status_seq;
	private int user_seq;
	private String status;
	public int getUser_status_seq() {
		return user_status_seq;
	}
	public void setUser_status_seq(int user_status_seq) {
		this.user_status_seq = user_status_seq;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
