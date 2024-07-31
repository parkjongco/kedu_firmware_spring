package com.kedu.firmware.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedu.firmware.DAO.MailDAO;
import com.kedu.firmware.DTO.MailDTO;

@Service
public class MailService {

	@Autowired
	private MailDAO maildao;
	
	// 메일작성
	public void insertMail(MailDTO dto) {
		maildao.insertMail(dto);
	}
	
	
	public List<MailDTO> getAllMails(){
		return maildao.selectAllMails();
	}
	
	public List<MailDTO> selectByMailSeq(int seq){
		return maildao.selectByMailSeq(seq);
	}
	
	public int deleteById(int id) {
		return maildao.deleteById(id);
	}
	
	
//	//유저 정보 받아오기
//	public UsersDTO getUserInfo(int sender_user_seq) {
//		return userdao.getUserInfo();
//	}
	
	
}
