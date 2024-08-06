package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentDTO {
	private int department_seq;
	private int department_unit_seq;
	private int department_captain_user_seq;
	private String department_title;
	private String department_description;
	private int department_code;
}
