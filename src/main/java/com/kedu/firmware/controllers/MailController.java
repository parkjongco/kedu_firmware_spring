package com.kedu.firmware.controllers;

import com.kedu.firmware.DTO.MailDTO;
import com.kedu.firmware.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


public class MailController {

	@Autowired
	private MailService mailServ;
	
	//-----------------------------
		//메일 작성
		@PostMapping
		public ResponseEntity<String> createMail(
				@RequestParam("to") String to,
	            @RequestParam("subject") String subject,
	            @RequestParam("message") String message,
	            @RequestParam(value = "attachments", required = false) MultipartFile[] attachments) {
			System.out.println("첨부파일 있는지 확인 중");
			try {
	            // 첨부 파일 처리
				if (attachments != null) {
		            for (MultipartFile file : attachments) {
		                if (!file.isEmpty()) { //첨부된 파일이 있다면 파일을 저장
		                    String fileName = file.getOriginalFilename();
		                    // 파일 저장 시점 fileServ를 불러와야 할 것이다.
		                    System.out.println("Received file: " + fileName);
		                }
		            }
				}
	            // 메일 데이터 전송 시점
	            // 보낸이 받고
	            // 보내는 이는 일단 임의의 값 집어넣어서 테스트
				System.out.println("To: " + to);
	            System.out.println("Subject: " + subject);
	            System.out.println("Message: " + message);
	            mailServ.insertMail(new MailDTO(3,3,3,subject,message,null,null,null,'N','N','Y'));
	            

	            return ResponseEntity.ok("메일이 성공적으로 전송되었습니다.");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(500).body("메일 전송 중 오류가 발생했습니다.");
	        }
			
			
		}
			
//		//메일 출력
//		@GetMapping
//		public ResponseEntity<List<MailDTO>> get(String title){ //모호성 문제(ambious)로 매핑을 나누지않고 같은 매핑안에서 사용해야한다. 
//			System.out.println(title);
//			
//			//분기점을 내부에서 만든다.
//			//메일 제목 반환
////			if(title != null) {
////				return ResponseEntity.ok(mailServ.selectByMailTitle(title));
////			} 
//			
//			//메일 리스트반환
//			List<MailDTO> list = mailServ.getAllMails();
//			return ResponseEntity.ok(list);
//		}
		
		
}
