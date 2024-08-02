package com.kedu.firmware.DTO;

import java.sql.Timestamp;


public class NoticeDTO {
	private int notice_seq;
	private String notice_title;
	private String notice_contents;
	private Timestamp notice_write_date;
	private int notice_view_count;

	public NoticeDTO() {}

	public int getNotice_seq() {
		return notice_seq;
	}

	public void setNotice_seq(int notice_seq) {
		this.notice_seq = notice_seq;
	}

	public String getNotice_title() {
		return notice_title;
	}

	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}

	public String getNotice_contents() {
		return notice_contents;
	}

	public void setNotice_contents(String notice_contents) {
		this.notice_contents = notice_contents;
	}

	public Timestamp getNotice_write_date() {
		return notice_write_date;
	}

	public void setNotice_write_date(Timestamp notice_write_date) {
		this.notice_write_date = notice_write_date;
	}

	public int getNotice_view_count() {
		return notice_view_count;
	}

	public void setNotice_view_count(int notice_view_count) {
		this.notice_view_count = notice_view_count;
	}

	public NoticeDTO(int notice_seq, String notice_title, String notice_contents, Timestamp notice_write_date,
			int notice_view_count) {
		super();
		this.notice_seq = notice_seq;
		this.notice_title = notice_title;
		this.notice_contents = notice_contents;
		this.notice_write_date = notice_write_date;
		this.notice_view_count = notice_view_count;
	}

}