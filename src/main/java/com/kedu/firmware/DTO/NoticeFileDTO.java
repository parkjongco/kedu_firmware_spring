package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeFileDTO {
	private int notice_file_seq;
	private int notice_seq;
	private String notice_file_name;
	private String notice_system_name;
	public int getNotice_file_seq() {
		return notice_file_seq;
	}
	public void setNotice_file_seq(int notice_file_seq) {
		this.notice_file_seq = notice_file_seq;
	}
	public int getNotice_seq() {
		return notice_seq;
	}
	public void setNotice_seq(int notice_seq) {
		this.notice_seq = notice_seq;
	}
	public String getNotice_file_name() {
		return notice_file_name;
	}
	public void setNotice_file_name(String notice_file_name) {
		this.notice_file_name = notice_file_name;
	}
	public String getNotice_system_name() {
		return notice_system_name;
	}
	public void setNotice_system_name(String notice_system_name) {
		this.notice_system_name = notice_system_name;
	}
	
	
}
