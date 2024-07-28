package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailBoxDTO {
	private int mailbox_seq;
	private int user_seq;
	private int mail_seq;
	private String mailbox_type;
	private String mailbox_name;
}
