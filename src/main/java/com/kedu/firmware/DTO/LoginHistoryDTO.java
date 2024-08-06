package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class LoginHistoryDTO {
	private int login_history_seq;
	private int user_seq;
	private Timestamp login_timestamp;
	private Timestamp logout_timestamp;
	private String IP_Address;
}
