package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnitDTO {
	private int unit_seq;
	private int unit_captain_user_seq;
	private int department_unit_seq;
	private String unit_title;
	private int department_under_unit_seq;
	private int unit_code;
	public int getUnit_seq() {
		return unit_seq;
	}
	public void setUnit_seq(int unit_seq) {
		this.unit_seq = unit_seq;
	}
	public int getUnit_captain_user_seq() {
		return unit_captain_user_seq;
	}
	public void setUnit_captain_user_seq(int unit_captain_user_seq) {
		this.unit_captain_user_seq = unit_captain_user_seq;
	}
	public int getDepartment_unit_seq() {
		return department_unit_seq;
	}
	public void setDepartment_unit_seq(int department_unit_seq) {
		this.department_unit_seq = department_unit_seq;
	}
	public String getUnit_title() {
		return unit_title;
	}
	public void setUnit_title(String unit_title) {
		this.unit_title = unit_title;
	}
	public int getDepartment_under_unit_seq() {
		return department_under_unit_seq;
	}
	public void setDepartment_under_unit_seq(int department_under_unit_seq) {
		this.department_under_unit_seq = department_under_unit_seq;
	}
	public int getUnit_code() {
		return unit_code;
	}
	public void setUnit_code(int unit_code) {
		this.unit_code = unit_code;
	}
	
	
}
