package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class PrivateMessageDTO {
	 private String senderUsername; // 보낸 사람의 사용자 이름
	    private String receiverUsername; // 받는 사람의 사용자 이름
	    private String content; // 메시지 내용
	    private Timestamp sendDate; // 보낸 날짜

	    // Getters and setters
	    public String getSenderUsername() {
	        return senderUsername;
	    }

	    public void setSenderUsername(String senderUsername) {
	        this.senderUsername = senderUsername;
	    }

	    public String getReceiverUsername() {
	        return receiverUsername;
	    }

	    public void setReceiverUsername(String receiverUsername) {
	        this.receiverUsername = receiverUsername;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	    public Timestamp getSendDate() {
	        return sendDate;
	    }

	    public void setSendDate(Timestamp sendDate) {
	        this.sendDate = sendDate;
	    }

	    // Constructors
	    public PrivateMessageDTO(String senderUsername, String receiverUsername, String content, Timestamp sendDate) {
	        this.senderUsername = senderUsername;
	        this.receiverUsername = receiverUsername;
	        this.content = content;
	        this.sendDate = sendDate;
	    }

	    public PrivateMessageDTO() {
	    }
	}

