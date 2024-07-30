package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileManagementDTO {
	private int file_management_seq;
	private int file_management_user_seq;
	private String file_action;
	private Timestamp action_date;
	private String details;
	public int getFile_management_seq() {
		return file_management_seq;
	}
	public void setFile_management_seq(int file_management_seq) {
		this.file_management_seq = file_management_seq;
	}
	public int getFile_management_user_seq() {
		return file_management_user_seq;
	}
	public void setFile_management_user_seq(int file_management_user_seq) {
		this.file_management_user_seq = file_management_user_seq;
	}
	public String getFile_action() {
		return file_action;
	}
	public void setFile_action(String file_action) {
		this.file_action = file_action;
	}
	public Timestamp getAction_date() {
		return action_date;
	}
	public void setAction_date(Timestamp action_date) {
		this.action_date = action_date;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
