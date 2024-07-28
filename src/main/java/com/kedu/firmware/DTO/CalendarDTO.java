package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalendarDTO {
	private int calendar_seq;
	private int group_seq;
	private String calendar_title;
	private String calendar_writer;
	private String calendar_content;
	private Timestamp calendar_start_date;
	private Timestamp calendar_end_date;
	private char calendar_allday;
	private String calendar_textcolor;
	private String calendar_background_color;
	private String calendar_border_color;
}
