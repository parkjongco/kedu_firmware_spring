package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApprovalLineDetailDTO {
	private int approval_line_detail_seq;
	private int approval_line_seq;
	private int approval_line_user_seq;
	private int approval_line_department_seq;
	private int approval_line_dept_seq;
	public int getApproval_line_detail_seq() {
		return approval_line_detail_seq;
	}
	public void setApproval_line_detail_seq(int approval_line_detail_seq) {
		this.approval_line_detail_seq = approval_line_detail_seq;
	}
	public int getApproval_line_seq() {
		return approval_line_seq;
	}
	public void setApproval_line_seq(int approval_line_seq) {
		this.approval_line_seq = approval_line_seq;
	}
	public int getApproval_line_user_seq() {
		return approval_line_user_seq;
	}
	public void setApproval_line_user_seq(int approval_line_user_seq) {
		this.approval_line_user_seq = approval_line_user_seq;
	}
	public int getApproval_line_department_seq() {
		return approval_line_department_seq;
	}
	public void setApproval_line_department_seq(int approval_line_department_seq) {
		this.approval_line_department_seq = approval_line_department_seq;
	}
	public int getApproval_line_dept_seq() {
		return approval_line_dept_seq;
	}
	public void setApproval_line_dept_seq(int approval_line_dept_seq) {
		this.approval_line_dept_seq = approval_line_dept_seq;
	}
}
