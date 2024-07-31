package com.kedu.firmware.DTO;

import java.sql.Timestamp;
import java.util.List;

public class ApprovalDTO {


	private int approval_seq;
	private int approval_template_seq;
	private int approval_drafter_seq;
	private int department_seq;
	private int department_unit_seq;
	private String approval_title;
	private int approval_status;
	private int approval_type_seq;
	private int approval_file_seq;
	private Timestamp approval_reg_date;
	private Timestamp approval_update_date;
	private Timestamp approval_end_date;
	private int approval_dept_seq;
	private List<String> approval_approver_seq;
	private String approval_contents;

	public ApprovalDTO(List<String> approval_approver_seq, String approval_contents, String approval_title,
			int approval_type_seq) {
		this.approval_approver_seq = approval_approver_seq;
		this.approval_contents = approval_contents;
		this.approval_title = approval_title;
		this.approval_type_seq = approval_type_seq;
	}
	
	public ApprovalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApprovalDTO(int approval_seq, int approval_template_seq, int approval_drafter_seq, int department_seq,
			int department_unit_seq, String approval_title, int approval_status, int approval_type_seq,
			int approval_file_seq, Timestamp approval_reg_date, Timestamp approval_update_date,
			Timestamp approval_end_date, int approval_dept_seq, List<String> approval_approver_seq,
			String approval_contents) {
		super();
		this.approval_seq = approval_seq;
		this.approval_template_seq = approval_template_seq;
		this.approval_drafter_seq = approval_drafter_seq;
		this.department_seq = department_seq;
		this.department_unit_seq = department_unit_seq;
		this.approval_title = approval_title;
		this.approval_status = approval_status;
		this.approval_type_seq = approval_type_seq;
		this.approval_file_seq = approval_file_seq;
		this.approval_reg_date = approval_reg_date;
		this.approval_update_date = approval_update_date;
		this.approval_end_date = approval_end_date;
		this.approval_dept_seq = approval_dept_seq;
		this.approval_approver_seq = approval_approver_seq;
		this.approval_contents = approval_contents;
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

	public String getApproval_title() {
		return approval_title;
	}

	public void setApproval_title(String approval_title) {
		this.approval_title = approval_title;
	}

	public int getApproval_status() {
		return approval_status;
	}

	public void setApproval_status(int approval_status) {
		this.approval_status = approval_status;
	}

	public int getApproval_type_seq() {
		return approval_type_seq;
	}

	public void setApproval_type_seq(int approval_type_seq) {
		this.approval_type_seq = approval_type_seq;
	}

	public int getApproval_file_seq() {
		return approval_file_seq;
	}

	public void setApproval_file_seq(int approval_file_seq) {
		this.approval_file_seq = approval_file_seq;
	}

	public Timestamp getApproval_reg_date() {
		return approval_reg_date;
	}

	public void setApproval_reg_date(Timestamp approval_reg_date) {
		this.approval_reg_date = approval_reg_date;
	}

	public Timestamp getApproval_update_date() {
		return approval_update_date;
	}

	public void setApproval_update_date(Timestamp approval_update_date) {
		this.approval_update_date = approval_update_date;
	}

	public Timestamp getApproval_end_date() {
		return approval_end_date;
	}

	public void setApproval_end_date(Timestamp approval_end_date) {
		this.approval_end_date = approval_end_date;
	}

	public int getApproval_dept_seq() {
		return approval_dept_seq;
	}

	public void setApproval_dept_seq(int approval_dept_seq) {
		this.approval_dept_seq = approval_dept_seq;
	}

	public List<String> getApproval_approver_seq() {
		return approval_approver_seq;
	}

	public void setApproval_approver_seq(List<String> approval_approver_seq) {
		this.approval_approver_seq = approval_approver_seq;
	}

	public String getApproval_contents() {
		return approval_contents;
	}

	public void setApproval_contents(String approval_contents) {
		this.approval_contents = approval_contents;
	}
}
