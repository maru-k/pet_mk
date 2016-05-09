package com.plat.pet.shop.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plat.pet.pilot.ResponseObject;
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
	@RequestMapping(value="newShop", method=RequestMethod.POST)
	public @ResponseBody ResponseObject<Map<String, String>> insertNewShop(@RequestBody Shop shop){
		ResponseObject<Map<String, String>> response = new ResponseObject<Map<String,String>>();
		Map<String, String> rtnNewShop = new HashMap<String, String>();
		shop.setShopId(getId());

		try{
			shopDao.insertNewShop(shop);
			response.setCode("20200");
			rtnNewShop.put("shopName", "Completed");
			response.setData(rtnNewShop);
		}catch(Exception e){
			response.setCode("20400");
			rtnNewShop.put("shopName", "Failed");
			response.setData(rtnNewShop);
			System.out.println("ERRRRRRRR :: " + e.getMessage());
		}
		return response;
		 
	}
	
	//ID generation ==> util class로 뺄것
	public String getId(){

		String generatedId = idGen();
		String id = generatedId.substring(2, generatedId.length());
		if(id.length()>= 14){
			id = id.substring(0, 14);
		}else{
			id = String.format("%02d",id);
		}
		return id;
		
	}
	
	private String idGen(){
		Random rnd = new Random();
		Double val = rnd.nextDouble();
		return val.toString();
		
	}
		
}
