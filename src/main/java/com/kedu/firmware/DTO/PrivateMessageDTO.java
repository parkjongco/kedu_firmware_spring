package com.kedu.firmware.DTO;

import java.sql.Timestamp;

public class PrivateMessageDTO {
    private String senderusername;
    private String receiverusername;
    private String content;
    private Timestamp sendDate;

    // 기본 생성자
    public PrivateMessageDTO() {
    }

    // 매개변수 생성자
    public PrivateMessageDTO(String senderusername, String receiverusername, String content, Timestamp sendDate) {
        this.senderusername = senderusername;
        this.receiverusername = receiverusername;
        this.content = content;
        this.sendDate = sendDate;
    }

    // Getter 및 Setter 메서드
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
}
