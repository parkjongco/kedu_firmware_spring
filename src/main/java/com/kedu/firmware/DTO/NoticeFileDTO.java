package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeFileDTO {
	private int notice_file_seq;
	private int notice_seq;
	private String notice_file_name;
	private String notice_system_name;
}
