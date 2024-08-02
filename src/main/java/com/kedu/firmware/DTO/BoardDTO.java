package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController

public class BoardDTO {
	private int board_seq;
	private String board_title;
	private String board_contents;
	private Timestamp board_write_date;
	private int board_view_count;

	public BoardDTO() {}
	public BoardDTO(int board_seq, String board_title, String board_contents, Timestamp board_write_date, int board_view_count) {
		this.board_seq = board_seq;
		this.board_title = board_title;
		this.board_contents = board_contents;
		this.board_write_date = board_write_date;
		this.board_view_count = board_view_count;
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_contents() {
		return board_contents;
	}

	public void setBoard_contents(String board_contents) {
		this.board_contents = board_contents;
	}

	public Timestamp getBoard_write_date() {
		return board_write_date;
	}

	public void setBoard_write_date(Timestamp board_write_date) {
		this.board_write_date = board_write_date;
	}

	public int getBoard_view_count() {
		return board_view_count;
	}

	public void setBoard_view_count(int board_view_count) {
		this.board_view_count = board_view_count;
	}
}
