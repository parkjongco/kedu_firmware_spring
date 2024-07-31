package com.kedu.firmware.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kedu.firmware.DTO.UsersDTO;

@Repository
public class UsersDAO {

    @Autowired
    private SqlSession mybatis;

    private static final Logger logger = LoggerFactory.getLogger(UsersDAO.class);
    
    public void insert(UsersDTO dto) {
        if (dto.getUsers_is_admin() == null) {
            dto.setUsers_is_admin(0);
        }
        mybatis.insert("Users.insertUser", dto); 
    }

    public UsersDTO findUserByUsername(String users_name) {
        UsersDTO user = mybatis.selectOne("Users.findUserByUsername", users_name);
        logger.info("findUserByUsername result: {}", user);
        return user;
    }

    public boolean isMember(UsersDTO dto) {
        UsersDTO result = findUserByUsername(dto.getUsers_name());
        if (result != null) {
            boolean passwordMatch = result.getUsers_password().equals(dto.getUsers_password());
            logger.info("Password match: {}", passwordMatch);
            return passwordMatch;
        }
        logger.info("Password match: false");
        return false;
    }

    public void deleteById(String id) {
        mybatis.delete("Users.deleteUser", id);
    }

    public UsersDTO selectById(String id) {
        return mybatis.selectOne("Users.selectById", id);
    }
}
