package com.kedu.firmware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedu.firmware.DTO.UsersDTO;
import com.kedu.firmware.services.UsersService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private HttpSession httpSession;

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody UsersDTO usesdto) {
        System.out.println(usesdto.getUsers_name() + " : " + usesdto.getUsers_password() + " : " + usesdto.getUsers_full_name());
        usersService.post(usesdto);
        return ResponseEntity.ok().build(); 
    }

    @DeleteMapping
    public ResponseEntity<Void> memberout() {
        String id = (String) httpSession.getAttribute("loginID");
        usersService.memberOut(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<UsersDTO> getMypage() {
        String id = (String) httpSession.getAttribute("loginID");
        if (id != null) {
            UsersDTO usesdto = usersService.getMemberById(id);
            return ResponseEntity.ok(usesdto);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
