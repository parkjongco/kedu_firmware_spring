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
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
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
	public char getBoard_delete_yn() {
		return board_delete_yn;
	}
	public void setBoard_delete_yn(char board_delete_yn) {
		this.board_delete_yn = board_delete_yn;
	}
	public Timestamp getBoard_delete_date() {
		return board_delete_date;
	}
	public void setBoard_delete_date(Timestamp board_delete_date) {
		this.board_delete_date = board_delete_date;
	}
	
	
}
