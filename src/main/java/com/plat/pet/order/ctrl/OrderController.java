package com.plat.pet.order.ctrl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plat.pet.order.dao.OrderDao;
import com.plat.pet.order.model.Order;
import com.plat.pet.order.model.OrderList;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderDao orderDao;
	
	/**
	 * request GET
	 * return List<class>
	 */
	@RequestMapping(value="orderList/{userId}", method=RequestMethod.GET)
	public @ResponseBody List<OrderList> myBeautyList(HttpServletRequest req,@PathVariable("userId") String userId){
		List<OrderList> rtnList = orderDao.selectMyBeautyList(userId); 
		return rtnList;
	}
	
	/**
	 * request GET
	 * return List<class>
	 */
	@RequestMapping(value="orderInfo/{orderId}", method=RequestMethod.GET)
	public @ResponseBody Order orderInfo(HttpServletRequest req,@PathVariable("orderId") String orderId){
		Order result = orderDao.selectOrderInfo(orderId); 
		return result;
	}
		
}
