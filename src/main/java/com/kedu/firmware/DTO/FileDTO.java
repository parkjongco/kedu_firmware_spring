package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class FileDTO {
	private int file_seq;
	private int file_owner_user_seq;
	private int category_seq;
	private String file_name;
	private String file_path;
	private long file_size;
	private Timestamp file_upload_date;
	private String file_description;
	private int file_management_seq;
	public int getFile_seq() {
		return file_seq;
	}
	public void setFile_seq(int file_seq) {
		this.file_seq = file_seq;
	}
	public int getFile_owner_user_seq() {
		return file_owner_user_seq;
	}
	public void setFile_owner_user_seq(int file_owner_user_seq) {
		this.file_owner_user_seq = file_owner_user_seq;
	}
	public int getCategory_seq() {
		return category_seq;
	}
	public void setCategory_seq(int category_seq) {
		this.category_seq = category_seq;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public long getFile_size() {
		return file_size;
	}
	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}
	public Timestamp getFile_upload_date() {
		return file_upload_date;
	}
	public void setFile_upload_date(Timestamp file_upload_date) {
		this.file_upload_date = file_upload_date;
	}
	public String getFile_description() {
		return file_description;
	}
	public void setFile_description(String file_description) {
		this.file_description = file_description;
	}
	public int getFile_management_seq() {
		return file_management_seq;
	}
	public void setFile_management_seq(int file_management_seq) {
		this.file_management_seq = file_management_seq;
	}
	
	
}
