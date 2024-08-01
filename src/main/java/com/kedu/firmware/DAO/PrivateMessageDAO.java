package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.PrivateMessageDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrivateMessageDAO {

    @Autowired
    private SqlSession mybatis;

    public void saveMessage(PrivateMessageDTO message) {
        mybatis.insert("privateMessage.insert", message);
    }

    public List<PrivateMessageDTO> selectAll() {
        return mybatis.selectList("privateMessage.selectAll");
    }

    public PrivateMessageDTO selectById(int id) {
        return mybatis.selectOne("privateMessage.selectById", id);
    }
}
