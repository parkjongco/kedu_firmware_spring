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
	
	public MailDTO(int mail_seq, int mail_sender_user_seq, int mailbox_seq, String mail_title, String mail_contents,
			Timestamp mail_sent_date, Timestamp mail_received_date, Timestamp mail_deleted_date, char mail_read_status,
			char mail_deleted_status, char mail_sent_status) {
		super();
		this.mail_seq = mail_seq;
		this.mail_sender_user_seq = mail_sender_user_seq;
		this.mailbox_seq = mailbox_seq;
		this.mail_title = mail_title;
		this.mail_contents = mail_contents;
		this.mail_sent_date = mail_sent_date;
		this.mail_received_date = mail_received_date;
		this.mail_deleted_date = mail_deleted_date;
		this.mail_read_status = mail_read_status;
		this.mail_deleted_status = mail_deleted_status;
		this.mail_sent_status = mail_sent_status;
	}
	
}
