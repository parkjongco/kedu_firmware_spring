package com.kedu.firmware.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedu.firmware.DTO.ApprovalTemplateDetailDTO;
import com.kedu.firmware.services.ApprovalServices;


@RestController
@RequestMapping("/approval")
public class ApprovalController {

	@Autowired
	ApprovalServices approvalService;
	
	//전자 결재 정보 받아오기
    @PostMapping
    public ResponseEntity<Void> approvalInsertion(@RequestBody Map<String, Object> data) {
    	ObjectMapper mapper = new ObjectMapper();
    	String json = (String)data.get("data");
    	System.out.println(json);
    	try {
			Map<String, String> map = mapper.readValue(json, Map.class);
			System.out.println(map.get("approval_title"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	
        return ResponseEntity.ok().build();
    }
    
    //결재 상신자 정보 가져오기
    //템플릿 정보 가져오기
    
    @GetMapping
    public List<ApprovalTemplateDetailDTO> getTemplateInfo(@RequestBody int approval_template_seq){
    }
    
}


