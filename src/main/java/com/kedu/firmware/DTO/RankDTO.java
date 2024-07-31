package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RankDTO {
	private int rank_seq;
	private String rank_code;
	private String rank_title;
	public int getRank_seq() {
		return rank_seq;
	}
	public void setRank_seq(int rank_seq) {
		this.rank_seq = rank_seq;
	}
	public String getRank_code() {
		return rank_code;
	}
	public void setRank_code(String rank_code) {
		this.rank_code = rank_code;
	}
	public String getRank_title() {
		return rank_title;
	}
	public void setRank_title(String rank_title) {
		this.rank_title = rank_title;
	}
	
	
}
