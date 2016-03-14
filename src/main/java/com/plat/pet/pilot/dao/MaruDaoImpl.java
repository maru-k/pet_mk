package com.plat.pet.pilot.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MaruDaoImpl implements MaruDao{

	@Autowired
	private SqlSession query;
	
	@Override
	public String selectTest() {
		// TODO Auto-generated method stub
//		query.selectOne("maru.maruTest");
		return query.selectOne("maru.maruTest");
	}

}
