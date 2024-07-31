package com.kedu.firmware.DTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardFileDTO {
	private int board_file_seq;
	private int board_seq;
	private String board_file_name;
	private String board_system_name;
}
