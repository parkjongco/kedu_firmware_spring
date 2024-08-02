package com.kedu.firmware.controllers;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/approval")
public class ApprovalController {

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
    	
        // 추가적인 데이터 처리 로직을 여기에 추가
        return ResponseEntity.ok().build();
    }
}


