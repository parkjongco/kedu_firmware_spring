package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BoardDTO {
	private int board_seq;
	private String board_title;
	private String board_content;
	private Timestamp board_write_date;
	private int board_view_count;
	private char board_delete_yn;
	private Timestamp board_delete_date;
}
