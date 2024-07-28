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
}
