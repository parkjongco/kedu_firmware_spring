package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordResetDTO {
	private int password_reset_seq;
	private int user_seq;
	private String email;
	private String verification_code;
	private Timestamp request_timestamp;
	private Timestamp expire_timestamp;
}
