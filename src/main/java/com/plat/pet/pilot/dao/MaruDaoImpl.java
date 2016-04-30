package com.plat.pet.pilot.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plat.pet.stl.model.Order;

@Repository
public class MaruDaoImpl implements MaruDao{

	@Autowired
	private SqlSession query;
	
	@Override
	public List<Order> selectList(String userId) {
		// TODO Auto-generated method stub
		query.selectOne("maru.maruTest");
		return query.selectList("maru.maruTest", userId);
		
		
		//maru can't connected database . ==> mokReturn
//		List<Order> maruMok = new ArrayList<>();
//		Order odr = new Order();
//		odr.setOrderId("orderId_1");
//		odr.setOrderRegion("rat lon? address?");
//		odr.setOrderSectCd("Hair_Hotel_Hospital ??? WOW 3H!!!");
//		odr.setPetPhotoId("petPhotoId");
//		odr.setPetSectCd("Dog? Cat? Bird? ETC");
//		odr.setPetSectDetailCd("foxhound? pitbull?");
//		odr.setPetStyleCd("Hair Code");
//		odr.setPetWeight("5Kg_return number 5");
//		odr.setUserId("User_Id");
//		odr.setUserOpinion("Punky! round");
//		maruMok.add(odr);
//		return maruMok;
	}

}
