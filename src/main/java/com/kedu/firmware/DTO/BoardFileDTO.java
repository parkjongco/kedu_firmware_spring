package com.kedu.firmware.DTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardFileDTO {
	private int board_file_seq;
	private int board_seq;
	private String board_file_name;
	private String board_system_name;
	public int getBoard_file_seq() {
		return board_file_seq;
	}
	public void setBoard_file_seq(int board_file_seq) {
		this.board_file_seq = board_file_seq;
	}
	public int getBoard_seq() {
		return board_seq;
	}
	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}
	public String getBoard_file_name() {
		return board_file_name;
	}
	public void setBoard_file_name(String board_file_name) {
		this.board_file_name = board_file_name;
	}
	public String getBoard_system_name() {
		return board_system_name;
	}
	public void setBoard_system_name(String board_system_name) {
		this.board_system_name = board_system_name;
	}
	
	
}
