package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.PrivateMessageDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// PrivateMessageDAO 클래스는 데이터베이스와 상호작용하여 메시지 데이터를 처리합니다.
// MyBatis를 사용하여 메시지를 저장하고 조회합니다.
@Repository
public class PrivateMessageDAO {

    @Autowired
    private SqlSession mybatis; // MyBatis의 SqlSession 객체

    // 메시지를 데이터베이스에 저장하는 메서드  
    public void saveMessage(PrivateMessageDTO message) {
        mybatis.insert("privateMessage.insert", message); // MyBatis XML 매핑 파일에 정의된 쿼리 호출
    }

    // 모든 메시지를 조회하는 메서드
    public List<PrivateMessageDTO> selectAll() {
        return mybatis.selectList("privateMessage.selectAll");
    }

    // 특정 ID의 메시지를 조회하는 메서드
    public PrivateMessageDTO selectById(int id) {
        return mybatis.selectOne("privateMessage.selectById", id);
    }

    // 특정 참여자 간의 메시지를 조회하는 메서드
    public List<PrivateMessageDTO> selectByParticipants(String sender, String receiver) {
        Map<String, Object> params = new HashMap<>();
        params.put("sender", sender);
        params.put("receiver", receiver);
        return mybatis.selectList("privateMessage.selectByParticipants", params);
    }
}
