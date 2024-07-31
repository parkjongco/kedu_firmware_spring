package com.kedu.firmware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedu.firmware.DTO.UsersDTO;
import com.kedu.firmware.services.UsersService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private HttpSession session;

    @PostMapping
    public ResponseEntity<UsersDTO> login(@RequestBody UsersDTO usersdto){
        boolean result = usersService.isMember(usersdto);
        if(!result) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }        
        session.setAttribute("loginID", usersdto.getUsers_name());
        UsersDTO user = usersService.getMemberById(usersdto.getUsers_name());
        return ResponseEntity.ok(user);
    }

    @DeleteMapping
    public ResponseEntity<String> logout() {
        session.removeAttribute("loginID");
        return ResponseEntity.ok().build();
    }
}

