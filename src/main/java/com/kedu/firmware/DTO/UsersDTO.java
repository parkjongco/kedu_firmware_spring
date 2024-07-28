package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDTO {
private int user_seq;
private String username;
private String users_password;
private String users_email;
private Timestamp users_created_at;
private Timestamp users_updated_at;
}
