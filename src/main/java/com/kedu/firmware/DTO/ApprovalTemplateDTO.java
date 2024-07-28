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
}
