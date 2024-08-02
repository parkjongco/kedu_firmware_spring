package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.PrivateMessageDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PrivateMessageDAO는 데이터베이스와의 CRUD 작업을 수행합니다.
 */
@Repository
public class PrivateMessageDAO {

    @Autowired
    private SqlSession mybatis; // MyBatis SQL 세션을 통해 데이터베이스 작업을 수행

    /**
     * 새로운 메시지를 데이터베이스에 저장합니다.
     * @param message 저장할 메시지 객체
     */
    public void saveMessage(PrivateMessageDTO message) {
        // MyBatis 매퍼를 사용하여 메시지를 삽입
        mybatis.insert("privateMessage.insert", message);
    }

    /**
     * 데이터베이스에서 모든 메시지를 조회합니다.
     * @return 모든 메시지의 리스트
     */
    public List<PrivateMessageDTO> selectAll() {
        // MyBatis 매퍼를 사용하여 모든 메시지 리스트 조회
        return mybatis.selectList("privateMessage.selectAll");
    }

    /**
     * 주어진 ID에 해당하는 메시지를 조회합니다.
     * @param id 조회할 메시지의 ID
     * @return 조회된 메시지 객체
     */
    public PrivateMessageDTO selectById(int id) {
        // MyBatis 매퍼를 사용하여 특정 ID의 메시지 조회
        return mybatis.selectOne("privateMessage.selectById", id);
    }
}
