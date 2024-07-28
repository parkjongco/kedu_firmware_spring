package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginHistoryDTO {
	private int login_history_seq;
	private int user_seq;
	private Timestamp login_timestamp;
	private Timestamp logout_timestamp;
	private String IP_Address;
}
