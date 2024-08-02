package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.NoticeDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoticeDAO {
    @Autowired
    private SqlSession mybatis;

    public void insert(NoticeDTO dto) {
        mybatis.insert("notice.insert", dto);
    }

    public List<NoticeDTO> selectAll() {
       return  mybatis.selectList("notice.selectAll");
    }

    public NoticeDTO selectBySeq(int seq) {
        return mybatis.selectOne("notice.selectBySeq", seq);
    }


}
