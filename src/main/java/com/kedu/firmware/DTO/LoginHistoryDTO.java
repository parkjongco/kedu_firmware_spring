package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginHistoryDTO {
	private int login_history_seq;
	private int user_seq;
	private Timestamp login_timestamp;
	private Timestamp logout_timestamp;
	private String IP_Address;
	public int getLogin_history_seq() {
		return login_history_seq;
	}
	public void setLogin_history_seq(int login_history_seq) {
		this.login_history_seq = login_history_seq;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public Timestamp getLogin_timestamp() {
		return login_timestamp;
	}
	public void setLogin_timestamp(Timestamp login_timestamp) {
		this.login_timestamp = login_timestamp;
	}
	public Timestamp getLogout_timestamp() {
		return logout_timestamp;
	}
	public void setLogout_timestamp(Timestamp logout_timestamp) {
		this.logout_timestamp = logout_timestamp;
	}
	public String getIP_Address() {
		return IP_Address;
	}
	public void setIP_Address(String iP_Address) {
		IP_Address = iP_Address;
	}
	
	
}
