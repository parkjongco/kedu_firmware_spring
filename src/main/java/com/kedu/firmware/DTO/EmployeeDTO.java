package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class EmployeeDTO {
	private int employee_seq;
	private int profile_seq;
	private int user_seq;
	private int department_seq;
	private int department_unit_seq;
	private int rank_seq;
	private String employee_code;
	private Timestamp employee_hire_date;
	private Timestamp employee_leave_date;
	private char is_employee_validate;
}
