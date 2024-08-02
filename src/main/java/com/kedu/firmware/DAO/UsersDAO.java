package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.UsersDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Repository
public class UsersDAO {

    @Autowired
    private SqlSession mybatis;

    // 로깅 기능을 제공하는 Logger 객체 생성
    private static final Logger logger = LoggerFactory.getLogger(UsersDAO.class);

    // 사용자 삽입
    public void insert(UsersDTO dto) {
        if (dto.getUsers_is_admin() == null) {
            dto.setUsers_is_admin(0);  // 관리자 여부가 설정되지 않은 경우 기본값 0 (일반 사용자)로 설정
        }
        mybatis.insert("Users.insertUser", dto);
        int usersSeq = mybatis.selectOne("Users.getLastInsertedUserSeq");
        dto.setUsers_seq(usersSeq);  // 자동 증가된 SEQ를 DTO에 설정
        logger.info("Inserted user with users_seq: {}", usersSeq);
    }

    // 사용자 시퀀스 ID를 통해 사용자 조회
    public UsersDTO findUserBySeq(int users_seq) {
        return mybatis.selectOne("Users.findUserBySeq", users_seq);
    }

    // 사용자 코드를 통해 사용자 조회
    public UsersDTO findUserByCode(String users_code) {
        logger.info("findUserByCode 호출: users_code={}", users_code);
        UsersDTO user = mybatis.selectOne("Users.findUserByCode", users_code);
        if (user == null) {
            logger.warn("사용자를 찾을 수 없습니다: {}", users_code);
        } else {
            logger.info("사용자 찾기 성공: {}", user);
        }
        return user;
    }

    // 사용자 고유 번호를 통해 사용자 삭제
    public void deleteById(int users_seq) {
        mybatis.delete("Users.deleteUser", users_seq);
    }

    // ID를 통해 사용자 조회
    public UsersDTO selectById(String id) {
        return mybatis.selectOne("Users.selectById", id);
    }

    // 특정 부서에 속한 직원 수를 계산
    public int countEmployeesInDepartment(String departmentCode) {
        return mybatis.selectOne("Users.countEmployeesInDepartment", departmentCode);
    }

    // 모든 사용자 정보를 조회하는 메서드 추가
    // 전체 사용자 정보를 조회하여 리스트로 반환
    public List<UsersDTO> getAllUsers() {
        return mybatis.selectList("Users.getAllUsers");
    }
}

