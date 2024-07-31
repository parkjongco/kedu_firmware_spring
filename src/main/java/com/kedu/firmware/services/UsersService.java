package com.kedu.firmware.services;

import com.kedu.firmware.DAO.UsersDAO;
import com.kedu.firmware.DTO.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UsersService {

    @Autowired
    private UsersDAO usersDAO;

    private static final Logger logger = LoggerFactory.getLogger(UsersService.class);

    public void post(UsersDTO dto) {
        usersDAO.insert(dto);
    }

    public boolean isMember(UsersDTO dto) {
        UsersDTO storedUser = usersDAO.findUserByUsername(dto.getUsers_name());
        if (storedUser != null) {
            boolean result = dto.getUsers_password().equals(storedUser.getUsers_password());
            logger.info("User found: {}", storedUser);
            logger.info("Input password: {}, Stored password: {}", dto.getUsers_password(), storedUser.getUsers_password());
            logger.info("isMember result: {}", result);
            return result;
        }
        logger.info("isMember result: false");
        return false;
    }

    public UsersDTO findUserByName(String users_name) {
        return usersDAO.findUserByUsername(users_name);
    }

    public void memberOut(String id) {
        usersDAO.deleteById(id);
    }

    public UsersDTO getMemberById(String id) {
        return usersDAO.selectById(id);
    }
}
