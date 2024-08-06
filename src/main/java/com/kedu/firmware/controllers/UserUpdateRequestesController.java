package com.kedu.firmware.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kedu.firmware.DTO.UserUpdateRequestesDTO;
import com.kedu.firmware.services.UserUpdateRequestesService;

@RestController
@RequestMapping("/user-update-request")
public class UserUpdateRequestesController {

    @Autowired
    private UserUpdateRequestesService userUpdateRequestService;

    @Value("${file.upload-dir}")
    private String uploadDir;

    @GetMapping("/{id}")
    public UserUpdateRequestesDTO getUserUpdateRequestById(@PathVariable("id") Long usersUpdateRequestSeq) {
        return userUpdateRequestService.getUserUpdateRequestById(usersUpdateRequestSeq);
    }

    @GetMapping("/approval-list")
    public List<UserUpdateRequestesDTO> getAllUserUpdateRequests() {
        return userUpdateRequestService.getAllUserUpdateRequests();
    }

    @PostMapping
    public void createUserUpdateRequest(@RequestBody UserUpdateRequestesDTO userUpdateRequest) {
        if (userUpdateRequest.getUsersSeq() == null) {
            System.out.println("Received null users_seq, setting default value or throwing exception.");
            throw new IllegalArgumentException("users_seq 값이 설정되지 않았습니다.");
        }
        userUpdateRequestService.createUserUpdateRequest(userUpdateRequest);
    }

    @PutMapping
    public void updateUserUpdateRequest(@RequestBody UserUpdateRequestesDTO userUpdateRequest) {
        if (userUpdateRequest.getUsersSeq() == null) {
            System.out.println("Update request received with null users_seq.");
            throw new IllegalArgumentException("users_seq 값이 설정되지 않았습니다.");
        }
        userUpdateRequestService.updateUserUpdateRequest(userUpdateRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteUserUpdateRequest(@PathVariable("id") Long usersUpdateRequestSeq) {
        userUpdateRequestService.deleteUserUpdateRequest(usersUpdateRequestSeq);
    }

    // 승인 요청을 처리합니다. 사용자 정보가 실제로 업데이트됩니다.
    @PostMapping("/approve/{id}")
    public void approveUserUpdateRequest(@PathVariable("id") Long usersUpdateRequestSeq) {
        userUpdateRequestService.approveUserUpdateRequest(usersUpdateRequestSeq);
    }

    // 거부 요청을 처리합니다. 사용자 정보는 변경되지 않으며, 요청 상태만 "거부됨"으로 업데이트됩니다.
    @PostMapping("/reject/{id}")
    public void rejectUserUpdateRequest(@PathVariable("id") Long usersUpdateRequestSeq) {
        userUpdateRequestService.rejectUserUpdateRequest(usersUpdateRequestSeq);
    }

    // 프로필 이미지 업로드 핸들러 추가
    @PostMapping("/upload-profile-image")
    public ResponseEntity<String> uploadProfileImage(@RequestParam("file") MultipartFile file) {
        try {
            // 파일 이름을 고유하게 생성합니다.
            String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
            
            // 업로드 경로를 설정합니다.
            Path filePath = Paths.get(uploadDir + File.separator + fileName);

            // 파일을 저장할 디렉토리가 없는 경우 생성합니다.
            Files.createDirectories(filePath.getParent());

            // 파일을 저장합니다.
            Files.write(filePath, file.getBytes());

            // 파일 경로를 반환합니다.
            return ResponseEntity.ok(filePath.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed.");
        }
    }
}
