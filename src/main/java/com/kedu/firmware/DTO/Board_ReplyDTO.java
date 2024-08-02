package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class Board_ReplyDTO {
    private int reply_seq;
    private String reply_uid;
    private String reply_contents;

    public int getReply_seq() {
        return reply_seq;
    }

    public void setReply_seq(int reply_seq) {
        this.reply_seq = reply_seq;
    }

    public Board_ReplyDTO() {}
    public Board_ReplyDTO(Timestamp reply_reg_date, String reply_contents, String reply_uid, int reply_seq) {
        this.reply_reg_date = reply_reg_date;
        this.reply_contents = reply_contents;
        this.reply_uid = reply_uid;
        this.reply_seq = reply_seq;
    }

    public String getReply_uid() {
        return reply_uid;
    }

    public void setReply_uid(String reply_uid) {
        this.reply_uid = reply_uid;
    }

    public String getReply_contents() {
        return reply_contents;
    }

    public void setReply_contents(String reply_contents) {
        this.reply_contents = reply_contents;
    }

    public Timestamp getReply_reg_date() {
        return reply_reg_date;
    }

    public void setReply_reg_date(Timestamp reply_reg_date) {
        this.reply_reg_date = reply_reg_date;
    }

    private Timestamp reply_reg_date;
}

