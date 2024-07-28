package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserProfileDTO {
	private int user_profile_seq;
	private int user_seq;
	private int department_seq;
	private int department_unit_seq;
	private int rank_seq;
	private String phone_number;
	private String address;
	private String profile_picture_url;
	private String position;
	private Timestamp hire_date;
}
