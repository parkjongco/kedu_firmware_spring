package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApprovalFileDTO {
	private int approval_file_seq;
	private int approval_seq;
	private int approval_template_seq;
	private int approval_drafter_seq;
	private String approval_file_sysname;
	private String approval_file_realname;
	private String approval_file_path;
	private int approval_owner_seq;
}
