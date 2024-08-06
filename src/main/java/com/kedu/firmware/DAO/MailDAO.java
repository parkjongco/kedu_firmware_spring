package com.kedu.firmware.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kedu.firmware.DTO.MailDTO;

@Repository
public class MailDAO {

	@Autowired
	private SqlSession mybatis;
	
	//메일 작성
	public void insertMail(MailDTO dto) {
		mybatis.insert("Mail.insertMail", dto);
	}
	//
	public List<MailDTO> selectAllMails(){
		return mybatis.selectList("Mail.selectALL");
	}
	
	public List<MailDTO> selectByMailTitle(String title){ 
		return mybatis.selectList("Mail.selectByTitle", title);
	}
	
}
