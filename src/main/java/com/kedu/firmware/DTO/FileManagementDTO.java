package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class FileManagementDTO {
	private int file_management_seq;
	private int file_management_user_seq;
	private String file_action;
	private Timestamp action_date;
	private String details;
	
}
