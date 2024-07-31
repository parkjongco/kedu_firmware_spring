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
	public int getMailbox_seq() {
		return mailbox_seq;
	}
	public void setMailbox_seq(int mailbox_seq) {
		this.mailbox_seq = mailbox_seq;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public int getMail_seq() {
		return mail_seq;
	}
	public void setMail_seq(int mail_seq) {
		this.mail_seq = mail_seq;
	}
	public String getMailbox_type() {
		return mailbox_type;
	}
	public void setMailbox_type(String mailbox_type) {
		this.mailbox_type = mailbox_type;
	}
	public String getMailbox_name() {
		return mailbox_name;
	}
	public void setMailbox_name(String mailbox_name) {
		this.mailbox_name = mailbox_name;
	}
	
	
}
