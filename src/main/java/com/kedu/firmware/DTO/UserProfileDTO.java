package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
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
	public int getUser_profile_seq() {
		return user_profile_seq;
	}
	public void setUser_profile_seq(int user_profile_seq) {
		this.user_profile_seq = user_profile_seq;
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
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfile_picture_url() {
		return profile_picture_url;
	}
	public void setProfile_picture_url(String profile_picture_url) {
		this.profile_picture_url = profile_picture_url;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Timestamp getHire_date() {
		return hire_date;
	}
	public void setHire_date(Timestamp hire_date) {
		this.hire_date = hire_date;
	}
	
	
}
