package com.kedu.firmware.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/approval")
public class ApprovalController {

	@PostMapping
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<Void> signup(@RequestBody String data) {
		System.out.println(data);
		return ResponseEntity.ok().build();
	}
}

