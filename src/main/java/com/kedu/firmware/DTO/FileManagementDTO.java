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
	
}
