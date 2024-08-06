package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class CategoriesDTO {
	private int category_seq;
	private String category_name;
	private String category_description;
	private Timestamp category_create_time;
}
