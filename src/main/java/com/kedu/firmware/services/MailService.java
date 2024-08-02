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
	
	public List<MailDTO> selectByMailTitle(String title){
		return maildao.selectByMailTitle(title);
	}
	
}
