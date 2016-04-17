package com.plat.pet.order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plat.pet.order.model.Order;
import com.plat.pet.order.model.OrderList;

@Repository
public class OrderDaoImpl implements OrderDao{

	@Autowired
	private SqlSession query;
	
	@Override
	public List<OrderList> selectMyBeautyList(String userId) {
		// TODO Auto-generated method stub
		return query.selectList("order.orderList",userId);
	}
	
	@Override
	public Order selectOrderInfo(String orderId) {
		// TODO Auto-generated method stub
		return query.selectOne("order.orderInfoByOrderId",orderId);
	}

}
