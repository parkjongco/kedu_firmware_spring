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
}
