package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationTypeDTO {
	private int vacation_type_seq;
	private String vacaction_type_name;
	public int getVacation_type_seq() {
		return vacation_type_seq;
	}
	public void setVacation_type_seq(int vacation_type_seq) {
		this.vacation_type_seq = vacation_type_seq;
	}
	public String getVacaction_type_name() {
		return vacaction_type_name;
	}
	public void setVacaction_type_name(String vacaction_type_name) {
		this.vacaction_type_name = vacaction_type_name;
	}
	
	
}
