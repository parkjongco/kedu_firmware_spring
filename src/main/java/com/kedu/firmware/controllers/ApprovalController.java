package com.kedu.firmware.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedu.firmware.DTO.ApprovalDTO;


@RestController
@RequestMapping("/approval")
public class ApprovalController {

	
	@PostMapping
	public ResponseEntity<Void> signup(@RequestBody List<Object> data) {
		ApprovalDTO approval = new ApprovalDTO();
		for(Object object : data) {
			System.out.println(object);
		}
//		for(Object object:data) {
//			JSONObject parsedData = new JSONObject(object.toString());
//			System.out.println(parsedData);
//		}
		return ResponseEntity.ok().build();
	}
}

