package com.plat.pet.order.dao;

import java.util.List;

import com.plat.pet.order.model.Order;
import com.plat.pet.order.model.OrderList;

public interface OrderDao {
	
	public List<OrderList> selectMyBeautyList(String userId);
	
	public Order selectOrderInfo(String orderId);
	
	public int insertOrder(Order order);
}
