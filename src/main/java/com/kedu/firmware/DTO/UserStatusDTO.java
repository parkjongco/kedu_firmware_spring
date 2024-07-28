package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserStatusDTO {
	private int user_status_seq;
	private int user_seq;
	private String status;
}
