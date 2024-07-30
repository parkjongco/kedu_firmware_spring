package com.kedu.firmware.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
=======
>>>>>>> 74f2520ee7df200d671f3aa54d9a3c54909f5162
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/approval")
public class ApprovalController {

	@PostMapping
<<<<<<< HEAD
	public ResponseEntity<Void> signup(@RequestBody String data) {
		System.out.println(data);
=======
	public ResponseEntity<Void> signup() {
>>>>>>> 74f2520ee7df200d671f3aa54d9a3c54909f5162
		return ResponseEntity.ok().build();
	}
}

