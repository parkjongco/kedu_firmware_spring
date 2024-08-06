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
			
		@GetMapping
		public ResponseEntity<Map<String, Object>> get(
		        @RequestParam(value = "seq", required = false) Integer seq,
		        @RequestParam(value = "query", required = false) String query,
		        @RequestParam(value = "page", defaultValue = "1") int page, // 추가된 부분: 페이지 번호
		        @RequestParam(value = "size", defaultValue = "10") int size // 추가된 부분: 페이지 당 메일 수
		) { // 모호성 문제(ambious)로 매핑을 나누지않고 같은 매핑안에서 사용해야한다. 

		    // 분기점을 내부에서 만든다.
		    // 사용자가 메일함 목록 선택했을때, 해당 메일함의 메일들이 출력
		    if(seq != null) {
		        System.out.println("seq 반환");
		        return ResponseEntity.ok(Map.of("mails", mailServ.selectByMailSeq(seq), "total", 1));
		    } 

		    // 메일 리스트반환
		    // 메일함 목록을 보여주어야하기때문에 각 메일함에서 첫번째로 작성된 메일들만 출력해야한다.
		    List<MailDTO> list = mailServ.getAllMails((String)session.getAttribute("loginID"));

		    // 검색어가 있는 경우 필터링
		    if (query != null && !query.isEmpty()) {
		    	System.out.println("검색어는 " + query);
		        list = list.stream()
		            .filter(mail -> mail.getMail_title().contains(query) || mail.getMail_content().contains(query))
		            .collect(Collectors.toList());
		        
		    }
		    
//		    // 검색기능 테스트 코드
//		    System.out.println(list.size()); 
//		 // 필터링된 list의 각 요소 출력
//		    list.forEach(mail -> {
//		        System.out.println("Mail Seq: " + mail.getMail_seq());
//		        System.out.println("Mail Title: " + mail.getMail_title());
//		        System.out.println("Mail Content: " + mail.getMail_content());
//		        System.out.println("Mail Sender User Seq: " + mail.getMail_sender_user_seq());
//		        System.out.println("Mailbox Seq: " + mail.getMailbox_seq());
//		        System.out.println("Mail Received Date: " + mail.getMail_received_date());
//		        System.out.println("------------------------------");
//		        
//		    });

		    // 전체 메일 수 계산
		    int totalMails = list.size();

		    // 페이징 처리
		    int start = (page - 1) * size;
		    int end = Math.min(start + size, list.size());
		    List<MailDTO> paginatedList = list.subList(start, end);

		    // 반환할 데이터 맵 구성
		    Map<String, Object> response = new HashMap<>();
		    response.put("mails", paginatedList);
		    response.put("total", totalMails);

		    return ResponseEntity.ok(response);
		}
		
		//선택된 메일 삭제
		@DeleteMapping("/{id}")
		public ResponseEntity<Void> delete(@PathVariable int id){
			int result = mailServ.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		
		//회신일 경우에 받는사람 입력란에 이메일 자동으로 완성해주기위한 기능
	    @GetMapping("/{replyToMailId}/replyemail")
	    public ResponseEntity<String> getReplyEmail(@PathVariable Integer replyToMailId) {
	        try {
	            List<MailDTO> originalMail = mailServ.selectByMailSeq(replyToMailId);
	            
	            UsersDTO userdto =  usersServ.findUserBySeq(originalMail.get(0).getMail_sender_user_seq());
	            
	            
	            System.out.println("회신할 사람의 이메일은" + userdto.getUsers_email());
	            if (userdto.getUsers_email() == null) {
	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	            }
	            
	            return ResponseEntity.ok(userdto.getUsers_email());
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	        }
	    }
		
		

		
//		
//		//보내는 이의 seq 값으로 보내는이의 정보 받아오기 (이름과 이메일 등)
//		@GetMapping("/{sender_user_seq}")
//		public ResponseEntity<UsersDTO> get(int sender_user_seq){  

//			//메일 리스트반환
//			List<MailDTO> list = mailServ.getAllMails();
//			return ResponseEntity.ok(list);
//		}
		
		
}
