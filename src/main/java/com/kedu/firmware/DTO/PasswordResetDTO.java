package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordResetDTO {
	private int password_reset_seq;
	private int user_seq;
	private String email;
	private String verification_code;
	private Timestamp request_timestamp;
	private Timestamp expire_timestamp;
	public int getPassword_reset_seq() {
		return password_reset_seq;
	}
	public void setPassword_reset_seq(int password_reset_seq) {
		this.password_reset_seq = password_reset_seq;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVerification_code() {
		return verification_code;
	}
	public void setVerification_code(String verification_code) {
		this.verification_code = verification_code;
	}
	public Timestamp getRequest_timestamp() {
		return request_timestamp;
	}
	public void setRequest_timestamp(Timestamp request_timestamp) {
		this.request_timestamp = request_timestamp;
	}
	public Timestamp getExpire_timestamp() {
		return expire_timestamp;
	}
	public void setExpire_timestamp(Timestamp expire_timestamp) {
		this.expire_timestamp = expire_timestamp;
	}
	
	
}
