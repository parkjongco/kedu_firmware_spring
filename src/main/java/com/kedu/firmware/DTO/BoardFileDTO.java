package com.kedu.firmware.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardFileDTO {
	private int board_file_seq;
	private int board_seq;
	private String board_file_name;
	private String board_system_name;
}
