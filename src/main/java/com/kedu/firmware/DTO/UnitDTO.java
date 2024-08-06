package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitDTO {
	private int unit_seq;
	private int unit_captain_user_seq;
	private int department_unit_seq;
	private String unit_title;
	private int department_under_unit_seq;
	private int unit_code;
}
