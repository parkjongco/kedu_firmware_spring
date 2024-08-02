package com.kedu.firmware.DTO;

public class ApprovalTemplateDetailDTO {
	private int approval_template_detail_seq;
	private int approval_template_seq;
	private int approval_template_user_seq;
	private String approval_template_sat_user;
	
	public int getApproval_template_detail_seq() {
		return approval_template_detail_seq;
	}
	public void setApproval_template_detail_seq(int approval_template_detail_seq) {
		this.approval_template_detail_seq = approval_template_detail_seq;
	}
	public int getApproval_template_seq() {
		return approval_template_seq;
	}
	public void setApproval_template_seq(int approval_template_seq) {
		this.approval_template_seq = approval_template_seq;
	}
	public int getApproval_template_user_seq() {
		return approval_template_user_seq;
	}
	public void setApproval_template_user_seq(int approval_template_user_seq) {
		this.approval_template_user_seq = approval_template_user_seq;
	}
	public String getApproval_template_sat_user() {
		return approval_template_sat_user;
	}
	public void setApproval_template_sat_user(String approval_template_sat_user) {
		this.approval_template_sat_user = approval_template_sat_user;
	}
}
