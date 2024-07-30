package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriesDTO {
	private int category_seq;
	private String category_name;
	private String category_description;
	private Timestamp category_create_time;
	public int getCategory_seq() {
		return category_seq;
	}
	public void setCategory_seq(int category_seq) {
		this.category_seq = category_seq;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_description() {
		return category_description;
	}
	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}
	public Timestamp getCategory_create_time() {
		return category_create_time;
	}
	public void setCategory_create_time(Timestamp category_create_time) {
		this.category_create_time = category_create_time;
	}
	
	
}
