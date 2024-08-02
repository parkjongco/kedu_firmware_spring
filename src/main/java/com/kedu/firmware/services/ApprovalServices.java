package com.kedu.firmware.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedu.firmware.DAO.ApprovalDAO;
import com.kedu.firmware.DTO.ApprovalTemplateDTO;

@Service
public class ApprovalServices {
	
	@Autowired
	private ApprovalDAO approvalDao;
	
	public List<ApprovalTemplateDTO> getTemplate(){
		
	}
}
