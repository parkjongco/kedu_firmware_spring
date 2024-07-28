package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailCarbonCopyDTO {
	private int mail_carbon_copy_seq;
	private int mail_carbon_receiver_seq;
	private int mail_seq;
	private int mail_sender_user_seq;
	private int mailbox_seq;
	private String carbon_copy_type;
	private String carbon_copy_status;
}
