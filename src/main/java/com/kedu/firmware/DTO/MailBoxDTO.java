package com.kedu.firmware.DTO;


public class MailBoxDTO {
	private Integer mailbox_seq;
	private int user_seq;
	
	public MailBoxDTO(Integer mailbox_seq, int user_seq) {
		super();
		this.mailbox_seq = mailbox_seq;
		this.user_seq = user_seq;
	}
	
	public MailBoxDTO() {
		
	}

	public Integer getMailbox_seq() {
		return mailbox_seq;
	}
	
	public void setMailbox_seq(Integer mailbox_seq) {
		this.mailbox_seq = mailbox_seq;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	
	
	
}
