package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
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
