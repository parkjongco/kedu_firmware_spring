package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailAttachmentDTO {
	private int mail_attachment_seq;
	private int mail_seq;
	public int getMail_attachment_seq() {
		return mail_attachment_seq;
	}
	public void setMail_attachment_seq(int mail_attachment_seq) {
		this.mail_attachment_seq = mail_attachment_seq;
	}
	public int getMail_seq() {
		return mail_seq;
	}
	public void setMail_seq(int mail_seq) {
		this.mail_seq = mail_seq;
	}
	
	
}
