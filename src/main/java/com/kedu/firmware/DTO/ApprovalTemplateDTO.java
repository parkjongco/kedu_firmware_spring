package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApprovalTemplateDTO {
	private int approval_template_seq;
	private int approval_template_owner_seq;
	private String approval_template_title;
	private String approval_path_step;
	private String approval_template_description;
	public int getApproval_template_seq() {
		return approval_template_seq;
	}
	public void setApproval_template_seq(int approval_template_seq) {
		this.approval_template_seq = approval_template_seq;
	}
	public int getApproval_template_owner_seq() {
		return approval_template_owner_seq;
	}
	public void setApproval_template_owner_seq(int approval_template_owner_seq) {
		this.approval_template_owner_seq = approval_template_owner_seq;
	}
	public String getApproval_template_title() {
		return approval_template_title;
	}
	public void setApproval_template_title(String approval_template_title) {
		this.approval_template_title = approval_template_title;
	}
	public String getApproval_path_step() {
		return approval_path_step;
	}
	public void setApproval_path_step(String approval_path_step) {
		this.approval_path_step = approval_path_step;
	}
	public String getApproval_template_description() {
		return approval_template_description;
	}
	public void setApproval_template_description(String approval_template_description) {
		this.approval_template_description = approval_template_description;
	}
}
