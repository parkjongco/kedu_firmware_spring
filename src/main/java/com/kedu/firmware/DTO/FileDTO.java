package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
