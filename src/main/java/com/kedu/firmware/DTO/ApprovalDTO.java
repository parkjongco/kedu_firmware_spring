package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
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
	private int approval_approver_seq;
	private String approval_contents;
}
