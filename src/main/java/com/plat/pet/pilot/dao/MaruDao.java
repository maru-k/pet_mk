package com.plat.pet.pilot.dao;

import java.util.List;

import com.plat.pet.stl.model.Order;

public interface MaruDao {
	public List<Order> selectList(String userId);
}
