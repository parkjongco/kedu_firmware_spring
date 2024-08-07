package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.UserProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

@Repository
public class UserProfileDAO {

	@Autowired
    private SqlSession mybatis;

    public UserProfileDTO getUserProfileByUserCode(String userCode) {
        return mybatis.selectOne("UserProfile.getUserProfileByUserCode", userCode);
    }

    public UserProfileDTO getUserProfileById(Long userProfileSeq) {
        return mybatis.selectOne("UserProfile.getUserProfileById", userProfileSeq);
    }

    public UserProfileDTO getUserProfileByUserSeq(Long userSeq) {
        return mybatis.selectOne("UserProfile.getUserProfileByUserSeq", userSeq);
    }

    public Long getUserSeqByUserCode(String userCode) {
        return mybatis.selectOne("UserProfile.getUserSeqByUserCode", userCode);
    }

    public void insertUserProfile(UserProfileDTO userProfile) {
        mybatis.insert("UserProfile.insertUserProfile", userProfile);
    }

    public void updateUserProfile(UserProfileDTO userProfile) {
        mybatis.update("UserProfile.updateUserProfile", userProfile);
    }

    public void deleteUserProfile(Long userProfileSeq) {
        mybatis.delete("UserProfile.deleteUserProfile", userProfileSeq);
    }
}
