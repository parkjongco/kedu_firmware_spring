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
    private UserUpdateRequestesDAO userUpdateRequestesDAO;

    @Value("${file.upload-dir}")
    private String uploadDir;

    @Value("${server.url}")
    private String serverUrl; // 서버의 URL을 설정 파일에서 불러오기

    // 특정 ID로 사용자 업데이트 요청을 가져오는 메서드
    public UserUpdateRequestesDTO getUserUpdateRequestById(Long userUpdateRequestSeq) {
        return userUpdateRequestesDAO.getUserUpdateRequestById(userUpdateRequestSeq);
    }

    // 모든 사용자 업데이트 요청을 가져오는 메서드
    public List<UserUpdateRequestesDTO> getAllUserUpdateRequests() {
        return userUpdateRequestesDAO.getAllUserUpdateRequests();
    }

    // 사용자 업데이트 요청을 생성하는 메서드
    @Transactional
    public void createUserUpdateRequest(UserUpdateRequestesDTO userUpdateRequest, MultipartFile profileImage) throws IOException {
        // 프로필 이미지가 있다면 저장하고 경로를 설정
        if (profileImage != null && !profileImage.isEmpty()) {
            String profileImageUrl = saveProfileImage(profileImage);
            userUpdateRequest.setProfileImage(profileImageUrl);
        }

        // 기존 요청이 있는지 확인
        UserUpdateRequestesDTO existingRequest = userUpdateRequestesDAO.getUserUpdateRequestByUserSeq(userUpdateRequest.getUsersSeq());
        if (existingRequest != null) {
            // 기존 요청이 있으면 업데이트
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

            userUpdateRequestesDAO.updateUserUpdateRequest(existingRequest);
        } else {
            // 새로운 요청을 생성
            userUpdateRequestesDAO.insertUserUpdateRequest(userUpdateRequest);
        }
    }

    // 사용자 업데이트 요청을 수정하는 메서드
    @Transactional
    public void updateUserUpdateRequest(UserUpdateRequestesDTO userUpdateRequest) {
        userUpdateRequestesDAO.updateUserUpdateRequest(userUpdateRequest);
    }

    // 사용자 업데이트 요청을 삭제하는 메서드
    @Transactional
    public void deleteUserUpdateRequest(Long userUpdateRequestSeq) {
        userUpdateRequestesDAO.deleteUserUpdateRequest(userUpdateRequestSeq);
    }

    // 사용자 업데이트 요청을 승인하는 메서드
    @Transactional
    public void approveUserUpdateRequest(Long userUpdateRequestSeq) {
        UserUpdateRequestesDTO request = userUpdateRequestesDAO.getUserUpdateRequestById(userUpdateRequestSeq);
        if (request != null) {
            request.setRequestStatus("승인됨");
            userUpdateRequestesDAO.updateUserUpdateRequest(request);
        } else {
            throw new IllegalArgumentException("Invalid request ID: " + userUpdateRequestSeq);
        }
    }

    // 사용자 업데이트 요청을 거부하는 메서드
    @Transactional
    public void rejectUserUpdateRequest(Long userUpdateRequestSeq) {
        UserUpdateRequestesDTO request = userUpdateRequestesDAO.getUserUpdateRequestById(userUpdateRequestSeq);
        if (request != null) {
            request.setRequestStatus("거부됨");
            userUpdateRequestesDAO.updateUserUpdateRequest(request);
        } else {
            throw new IllegalArgumentException("Invalid request ID: " + userUpdateRequestSeq);
        }
    }

    // 프로필 이미지를 저장하고 웹 경로를 반환하는 메서드
    public String saveProfileImage(MultipartFile file) throws IOException {
        // 파일 이름 생성 (UUID와 원본 파일 이름 결합)
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        // 파일 경로 생성
        Path filePath = Paths.get(uploadDir + File.separator + fileName);

        // 디버깅 로그 추가
        System.out.println("파일 경로: " + filePath.toString());

        // 디렉토리가 없으면 생성
        Files.createDirectories(filePath.getParent());
        // 파일 쓰기
        Files.write(filePath, file.getBytes());

        String profileImageUrl = serverUrl + "/uploads/" + fileName;
        // 경로 로그 추가
        System.out.println("프로필 이미지 URL: " + profileImageUrl);

        // 웹 브라우저에서 접근 가능한 경로로 반환
        return profileImageUrl;
    }
}
