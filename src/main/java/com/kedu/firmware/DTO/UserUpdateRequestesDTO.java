package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequestesDTO {
	private int user_update_request_seq;
	private int user_seq;
	private String phone_number;
	private String email;
	private String request_reason;
	private String request_status;
	private Timestamp request_timestamp;
	private String approved_by;
	private Timestamp approved_timestamp;
	public int getUser_update_request_seq() {
		return user_update_request_seq;
	}
	public void setUser_update_request_seq(int user_update_request_seq) {
		this.user_update_request_seq = user_update_request_seq;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRequest_reason() {
		return request_reason;
	}
	public void setRequest_reason(String request_reason) {
		this.request_reason = request_reason;
	}
	public String getRequest_status() {
		return request_status;
	}
	public void setRequest_status(String request_status) {
		this.request_status = request_status;
	}
	public Timestamp getRequest_timestamp() {
		return request_timestamp;
	}
	public void setRequest_timestamp(Timestamp request_timestamp) {
		this.request_timestamp = request_timestamp;
	}
	public String getApproved_by() {
		return approved_by;
	}
	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}
	public Timestamp getApproved_timestamp() {
		return approved_timestamp;
	}
	public void setApproved_timestamp(Timestamp approved_timestamp) {
		this.approved_timestamp = approved_timestamp;
	}
	
	
}
