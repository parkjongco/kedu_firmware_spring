package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequestesDTO {
	private int user_update_request_seq;
	private int user_seq;
	private String phone_number;
	private String email;
	private String request_reason;
	private String request_status;
	private Timestamp request_timestamp;
	private String approved_by;
	private Timestamp approved_timestamp;
}
