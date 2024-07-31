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
		return mybatis.selectList("Mail.selectAll");
	}
	
	public List<MailDTO> selectByMailSeq(int seq){ 
		return mybatis.selectList("Mail.selectBySeq", seq);
	}
	
	public int deleteById(int id) {
		return mybatis.delete("Mail.deleteSelectedMail", id);
	}
	
//	public UsersDTO getSenderInfo(int sender_user_seq) {
//		return mybatis.selectOne("User.selectSenderInfo", sender_user_seq);
//	}
	
}
