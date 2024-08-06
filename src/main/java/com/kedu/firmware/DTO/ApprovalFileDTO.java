package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApprovalFileDTO {
	private int approval_file_seq;
	private int approval_seq;
	private int approval_template_seq;
	private int approval_drafter_seq;
	private String approval_file_sysname;
	private String approval_file_realname;
	private String approval_file_path;
	private int approval_owner_seq;
	public int getApproval_file_seq() {
		return approval_file_seq;
	}
	public void setApproval_file_seq(int approval_file_seq) {
		this.approval_file_seq = approval_file_seq;
	}
	public int getApproval_seq() {
		return approval_seq;
	}
	public void setApproval_seq(int approval_seq) {
		this.approval_seq = approval_seq;
	}
	public int getApproval_template_seq() {
		return approval_template_seq;
	}
	public void setApproval_template_seq(int approval_template_seq) {
		this.approval_template_seq = approval_template_seq;
	}
	public int getApproval_drafter_seq() {
		return approval_drafter_seq;
	}
	public void setApproval_drafter_seq(int approval_drafter_seq) {
		this.approval_drafter_seq = approval_drafter_seq;
	}
	public String getApproval_file_sysname() {
		return approval_file_sysname;
	}
	public void setApproval_file_sysname(String approval_file_sysname) {
		this.approval_file_sysname = approval_file_sysname;
	}
	public String getApproval_file_realname() {
		return approval_file_realname;
	}
	public void setApproval_file_realname(String approval_file_realname) {
		this.approval_file_realname = approval_file_realname;
	}
	public String getApproval_file_path() {
		return approval_file_path;
	}
	public void setApproval_file_path(String approval_file_path) {
		this.approval_file_path = approval_file_path;
	}
	public int getApproval_owner_seq() {
		return approval_owner_seq;
	}
	public void setApproval_owner_seq(int approval_owner_seq) {
		this.approval_owner_seq = approval_owner_seq;
	}
}
