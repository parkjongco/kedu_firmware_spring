package com.kedu.firmware.DTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailBoxDTO {
	private int mailbox_seq;
	private int user_seq;
	private int mail_seq;
	private String mailbox_type;
	private String mailbox_name;
}
