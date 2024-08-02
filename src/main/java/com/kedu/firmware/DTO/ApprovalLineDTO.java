package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApprovalLineDTO {
	private int approval_line_seq;

	public int getApproval_line_seq() {
		return approval_line_seq;
	}

	public void setApproval_line_seq(int approval_line_seq) {
		this.approval_line_seq = approval_line_seq;
	}
}
