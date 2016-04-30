package com.plat.pet.pilot.dao;

import java.util.List;

import com.plat.pet.order.model.Order;



public interface MaruDao {
	public String selectTest();

	List<Order> selectList(String userId);
	
}
