package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDTO {
	private int notice_seq;
	private String notice_title;
	private String notice_content;
	private Timestamp notice_write_date;
	private int notice_view_count;
}
