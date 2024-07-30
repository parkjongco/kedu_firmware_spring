package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDTO {
	private int user_seq;
	private String username;
	private String users_password;
	private String users_email;
	private Timestamp users_created_at;
	private Timestamp users_updated_at;
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsers_password() {
		return users_password;
	}
	public void setUsers_password(String users_password) {
		this.users_password = users_password;
	}
	public String getUsers_email() {
		return users_email;
	}
	public void setUsers_email(String users_email) {
		this.users_email = users_email;
	}
	public Timestamp getUsers_created_at() {
		return users_created_at;
	}
	public void setUsers_created_at(Timestamp users_created_at) {
		this.users_created_at = users_created_at;
	}
	public Timestamp getUsers_updated_at() {
		return users_updated_at;
	}
	public void setUsers_updated_at(Timestamp users_updated_at) {
		this.users_updated_at = users_updated_at;
	}
	
	
}
