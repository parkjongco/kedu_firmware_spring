package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.Board_ReplyDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Board_ReplyDAO {

    @Autowired
   private SqlSession mybaits;

    public void insert(Board_ReplyDTO dto) {
        mybaits.insert("reply.insert", dto);
    }
}


