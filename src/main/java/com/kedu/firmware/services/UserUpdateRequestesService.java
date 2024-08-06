package com.kedu.firmware.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.kedu.firmware.DAO.UserUpdateRequestesDAO;
import com.kedu.firmware.DTO.UserUpdateRequestesDTO;

@Service
public class UserUpdateRequestesService {

    @Autowired
    private UserUpdateRequestesDAO userUpdateRequestDAO;
    

    @Value("${file.upload-dir}")
    private String uploadDir;

    public UserUpdateRequestesDTO getUserUpdateRequestById(Long userUpdateRequestSeq) {
        return userUpdateRequestDAO.getUserUpdateRequestById(userUpdateRequestSeq);
    }

    public List<UserUpdateRequestesDTO> getAllUserUpdateRequests() {
        return userUpdateRequestDAO.getAllUserUpdateRequests();
    }

    @Transactional
    public void createUserUpdateRequest(UserUpdateRequestesDTO userUpdateRequest) {
        // 동일한 usersSeq로 기존 요청이 있는지 확인
        UserUpdateRequestesDTO existingRequest = userUpdateRequestDAO.getUserUpdateRequestByUserSeq(userUpdateRequest.getUsersSeq());

        if (existingRequest != null) {
            // 기존 요청이 있다면 업데이트
            existingRequest.setPhoneNumber(userUpdateRequest.getPhoneNumber());
            existingRequest.setEmail(userUpdateRequest.getEmail());
            existingRequest.setAddress(userUpdateRequest.getAddress());
            existingRequest.setZipCode(userUpdateRequest.getZipCode());
            existingRequest.setDetailedAddress(userUpdateRequest.getDetailedAddress());
            existingRequest.setRequestReason(userUpdateRequest.getRequestReason());
            existingRequest.setRequestStatus(userUpdateRequest.getRequestStatus());
            existingRequest.setRequestTimestamp(userUpdateRequest.getRequestTimestamp());
            existingRequest.setProfileImage(userUpdateRequest.getProfileImage());
            existingRequest.setRank(userUpdateRequest.getRank());
            existingRequest.setEmployeeId(userUpdateRequest.getEmployeeId());
            existingRequest.setJoinDate(userUpdateRequest.getJoinDate());
            existingRequest.setApprover(userUpdateRequest.getApprover());

            userUpdateRequestDAO.updateUserUpdateRequest(existingRequest);
        } else {
            // 기존 요청이 없다면 새로 생성
            userUpdateRequestDAO.insertUserUpdateRequest(userUpdateRequest);
        }
    }

    @Transactional
    public void updateUserUpdateRequest(UserUpdateRequestesDTO userUpdateRequest) {
        userUpdateRequestDAO.updateUserUpdateRequest(userUpdateRequest);
    }

    @Transactional
    public void deleteUserUpdateRequest(Long userUpdateRequestSeq) {
        userUpdateRequestDAO.deleteUserUpdateRequest(userUpdateRequestSeq);
    }

    @Transactional
    public void approveUserUpdateRequest(Long userUpdateRequestSeq) {
        UserUpdateRequestesDTO request = userUpdateRequestDAO.getUserUpdateRequestById(userUpdateRequestSeq);
        if (request != null) {
            request.setRequestStatus("승인됨");
            // 사용자 프로필을 업데이트하는 로직이 추가되어야 함
            // 예: userProfileService.updateUserProfile(request);
            userUpdateRequestDAO.updateUserUpdateRequest(request); // 요청의 상태를 "승인됨"으로 업데이트
        } else {
            throw new IllegalArgumentException("Invalid request ID: " + userUpdateRequestSeq);
        }
    }

    @Transactional
    public void rejectUserUpdateRequest(Long userUpdateRequestSeq) {
        UserUpdateRequestesDTO request = userUpdateRequestDAO.getUserUpdateRequestById(userUpdateRequestSeq);
        if (request != null) {
            request.setRequestStatus("거부됨");
            userUpdateRequestDAO.updateUserUpdateRequest(request); // 요청의 상태를 "거부됨"으로 업데이트
            // 사용자 프로필은 업데이트하지 않음
        } else {
            throw new IllegalArgumentException("Invalid request ID: " + userUpdateRequestSeq);
        }
    }
    // 프로필 이미지 저장 메소드
    public String saveProfileImage(MultipartFile file) throws IOException {
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        Path filePath = Paths.get(uploadDir + File.separator + fileName);
        Files.createDirectories(filePath.getParent());
        Files.write(filePath, file.getBytes());
        return filePath.toString();
    }
}
