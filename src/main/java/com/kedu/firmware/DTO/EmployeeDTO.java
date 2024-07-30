package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
	public int getEmployee_seq() {
		return employee_seq;
	}
	public void setEmployee_seq(int employee_seq) {
		this.employee_seq = employee_seq;
	}
	public int getProfile_seq() {
		return profile_seq;
	}
	public void setProfile_seq(int profile_seq) {
		this.profile_seq = profile_seq;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public int getDepartment_seq() {
		return department_seq;
	}
	public void setDepartment_seq(int department_seq) {
		this.department_seq = department_seq;
	}
	public int getDepartment_unit_seq() {
		return department_unit_seq;
	}
	public void setDepartment_unit_seq(int department_unit_seq) {
		this.department_unit_seq = department_unit_seq;
	}
	public int getRank_seq() {
		return rank_seq;
	}
	public void setRank_seq(int rank_seq) {
		this.rank_seq = rank_seq;
	}
	public String getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}
	public Timestamp getEmployee_hire_date() {
		return employee_hire_date;
	}
	public void setEmployee_hire_date(Timestamp employee_hire_date) {
		this.employee_hire_date = employee_hire_date;
	}
	public Timestamp getEmployee_leave_date() {
		return employee_leave_date;
	}
	public void setEmployee_leave_date(Timestamp employee_leave_date) {
		this.employee_leave_date = employee_leave_date;
	}
	public char getIs_employee_validate() {
		return is_employee_validate;
	}
	public void setIs_employee_validate(char is_employee_validate) {
		this.is_employee_validate = is_employee_validate;
	}
	
	
}
