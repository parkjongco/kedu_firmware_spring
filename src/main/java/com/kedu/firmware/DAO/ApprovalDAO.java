package com.kedu.firmware.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ApprovalDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	static final String NAMESPACE="Approval";
	
	public int getTemplate() {
		return sqlSession.selectOne(NAMESPACE+".getTemplate");
	}
	
}
