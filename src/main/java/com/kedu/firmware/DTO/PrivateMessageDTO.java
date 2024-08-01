package com.kedu.firmware.DTO;

import java.sql.Timestamp;

<<<<<<< HEAD
public class PrivateMessageDTO {
    private String senderusername;
    private String receiverusername;
=======
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateMessageDTO {
    private String senderUsername;
    private String receiverUsername;
>>>>>>> origin/master
    private String content;
    private Timestamp sendDate;

    // 기본 생성자
    public PrivateMessageDTO() {
    }

    // 매개변수 생성자
<<<<<<< HEAD
    public PrivateMessageDTO(String senderusername, String receiverusername, String content, Timestamp sendDate) {
        this.senderusername = senderusername;
        this.receiverusername = receiverusername;
=======
    public PrivateMessageDTO(String senderUsername, String receiverUsername, String content, Timestamp sendDate) {
        this.senderUsername = senderUsername;
        this.receiverUsername = receiverUsername;
>>>>>>> origin/master
        this.content = content;
        this.sendDate = sendDate;
    }

    // Getter 및 Setter 메서드
<<<<<<< HEAD
    public String getSenderusername() {
        return senderusername;
    }

    public void setSenderusername(String senderusername) {
        this.senderusername = senderusername;
    }

    public String getReceiverusername() {
        return receiverusername;
    }

    public void setReceiverusername(String receiverusername) {
        this.receiverusername = receiverusername;
=======
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
>>>>>>> origin/master
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
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
