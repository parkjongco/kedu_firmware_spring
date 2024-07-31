package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserStatusDTO {
	private int user_status_seq;
	private int user_seq;
	private String status;
}
