package com.kedu.firmware.DTO;

import java.sql.Timestamp;

public class UsersDTO {
    private int users_seq;
    private String users_name;
    private String users_password;
    private String users_email;
    private String users_full_name;
    private Timestamp users_created_at;
    private Timestamp users_updated_at;
    private Integer users_is_admin;

    // Getters and Setters
    public int getUsers_seq() {
        return users_seq;
    }

    public void setUsers_seq(int users_seq) {
        this.users_seq = users_seq;
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    public String getUsers_password() {
        return users_password;
    }

    public void setUsers_password(String users_password) {
        this.users_password = users_password;
    }

    public String getUsers_email() {
        return users_email;
    }

    public void setUsers_email(String users_email) {
        this.users_email = users_email;
    }

    public String getUsers_full_name() {
        return users_full_name;
    }

    public void setUsers_full_name(String users_full_name) {
        this.users_full_name = users_full_name;
    }

    public Timestamp getUsers_created_at() {
        return users_created_at;
    }

    public void setUsers_created_at(Timestamp users_created_at) {
        this.users_created_at = users_created_at;
    }

    public Timestamp getUsers_updated_at() {
        return users_updated_at;
    }

    public void setUsers_updated_at(Timestamp users_updated_at) {
        this.users_updated_at = users_updated_at;
    }

    public Integer getUsers_is_admin() {
        return users_is_admin;
    }

    public void setUsers_is_admin(Integer users_is_admin) {
        this.users_is_admin = users_is_admin;
    }
}