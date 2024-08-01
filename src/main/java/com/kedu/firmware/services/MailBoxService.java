package com.kedu.firmware.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedu.firmware.DAO.MailBoxDAO;

@Service
public class MailBoxService {

	@Autowired
	private MailBoxDAO mailboxdao;
	
	public int deleteById(int id) {
		return mailboxdao.deleteById(id);
	}
}
