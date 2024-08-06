package com.kedu.firmware.DTO;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class UsersDTO {
private int user_seq;
private String username;
private String users_password;
private String users_email;
private Timestamp users_created_at;
private Timestamp users_updated_at;
}
