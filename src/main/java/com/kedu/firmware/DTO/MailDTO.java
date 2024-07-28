package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailDTO {
	private int mail_seq;
	private int mail_sender_user_seq;
	private int mailbox_seq;
	private String mail_title;
	private String mail_contents;
	private Timestamp mail_sent_date;
	private Timestamp mail_received_date;
	private Timestamp mail_deleted_date;
	private char mail_read_status;
	private char mail_deleted_status;
	private char mail_sent_status;
}
