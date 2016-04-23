package com.plat.pet.shop.ctrl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plat.pet.shop.dao.ShopDao;
import com.plat.pet.shop.model.Shop;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ShopDao shopDao;
	
	/**
	 * request GET
	 * return List<class>
	 */
	@RequestMapping(value="orderList/{userId}", method=RequestMethod.GET)
	public @ResponseBody List<Shop> myBeautyList(HttpServletRequest req){
		List<Shop> rtnList = shopDao.selectShopList(); 
		return rtnList;
	}
	
	/**
	 * request GET
	 * return List<class>
	 */
	@RequestMapping(value="orderInfo/{orderId}", method=RequestMethod.GET)
	public @ResponseBody Shop orderInfo(HttpServletRequest req,@PathVariable("shopId") String shopId){
		Shop result = shopDao.selectShopInfo(shopId); 
		return result;
	}
		
	/**
	 * request POST
	 * return List<class>
	 */
	@RequestMapping(value="/", method=RequestMethod.POST)
	public @ResponseBody void insertNewShop(@RequestBody Shop shop){
		shopDao.insertNewShop(shop); 
	}
		
}
