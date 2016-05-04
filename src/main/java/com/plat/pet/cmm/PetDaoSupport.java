package com.plat.pet.cmm;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class PetDaoSupport {
	@Autowired
	private SqlSession sqlSession;

	public SqlSession getSqlSession(){
		return sqlSession;
	}
}
