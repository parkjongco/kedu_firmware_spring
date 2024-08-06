package com.kedu.firmware.services;

import com.kedu.firmware.DAO.UserProfileDAO;
import com.kedu.firmware.DTO.UserProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileDAO userProfileDAO;

    public UserProfileDTO getUserProfileByUserCode(String userCode) {
        UserProfileDTO userProfile = userProfileDAO.getUserProfileByUserCode(userCode);
        if (userProfile == null) {
            // 프로필이 없으면 기본값 설정
            userProfile = new UserProfileDTO();
            userProfile.setUserSeq(userProfileDAO.getUserSeqByUserCode(userCode));
            userProfile.setPhoneNumber("010-0000-0000"); // 기본값
            userProfile.setAddress("Default Address"); // 기본값
            userProfile.setProfilePictureUrl("/images/default.png"); // 기본값
            // 데이터베이스에 새 프로필 삽입
            userProfileDAO.insertUserProfile(userProfile);
            // 다시 한번 조회하여 완전한 객체를 반환
            userProfile = userProfileDAO.getUserProfileByUserCode(userCode);
        }
        return userProfile;
    }

    public UserProfileDTO getUserProfileById(Long userProfileSeq) {
        return userProfileDAO.getUserProfileById(userProfileSeq);
    }

    public void createUserProfile(UserProfileDTO userProfile) {
        userProfileDAO.insertUserProfile(userProfile);
    }

    public void updateUserProfile(UserProfileDTO userProfile) {
        userProfileDAO.updateUserProfile(userProfile);
    }

    public void deleteUserProfile(Long userProfileSeq) {
        userProfileDAO.deleteUserProfile(userProfileSeq);
    }
}
