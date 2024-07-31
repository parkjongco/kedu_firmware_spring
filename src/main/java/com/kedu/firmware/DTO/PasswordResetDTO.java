package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class PasswordResetDTO {
	private int password_reset_seq;
	private int user_seq;
	private String email;
	private String verification_code;
	private Timestamp request_timestamp;
	private Timestamp expire_timestamp;
}
