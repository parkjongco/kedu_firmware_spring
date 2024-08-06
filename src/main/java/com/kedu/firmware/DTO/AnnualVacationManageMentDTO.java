package com.kedu.firmware.DTO;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnualVacationManageMentDTO {
	private int annual_vacation_manage_seq;
	private int user_seq;
	private int total_annual_vaction_days;
	private int used_annual_vacation_days;
	private int remain_annual_vaction_days;
}
