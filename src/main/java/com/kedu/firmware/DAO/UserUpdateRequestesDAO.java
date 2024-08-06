package com.kedu.firmware.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kedu.firmware.DTO.UserUpdateRequestesDTO;

@Repository
public class UserUpdateRequestesDAO {
	
	 @Autowired
	    private SqlSession mybatis;

	    public UserUpdateRequestesDTO getUserUpdateRequestById(Long userUpdateRequestSeq) {
	        return mybatis.selectOne("UserUpdateRequest.getUserUpdateRequestById", userUpdateRequestSeq);
	    }

	    public UserUpdateRequestesDTO getUserUpdateRequestByUserSeq(Long usersSeq) {
	        return mybatis.selectOne("UserUpdateRequest.getUserUpdateRequestByUserSeq", usersSeq);
	    }

	    public List<UserUpdateRequestesDTO> getAllUserUpdateRequests() {
	        return mybatis.selectList("UserUpdateRequest.getAllUserUpdateRequests");
	    }

	    public void insertUserUpdateRequest(UserUpdateRequestesDTO userUpdateRequest) {
	        mybatis.insert("UserUpdateRequest.insertUserUpdateRequest", userUpdateRequest);
	    }

	    public void updateUserUpdateRequest(UserUpdateRequestesDTO userUpdateRequest) {
	        mybatis.update("UserUpdateRequest.updateUserUpdateRequest", userUpdateRequest);
	    }

	    public void deleteUserUpdateRequest(Long userUpdateRequestSeq) {
	        mybatis.delete("UserUpdateRequest.deleteUserUpdateRequest", userUpdateRequestSeq);
	    }
}
