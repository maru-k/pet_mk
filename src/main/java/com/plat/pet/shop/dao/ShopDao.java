package com.plat.pet.shop.dao;

import java.util.List;

import com.plat.pet.shop.model.Shop;

public interface ShopDao {
	
	public List<Shop> selectShopList();
	
	public Shop selectShopInfo(String shopId);
	
	public void insertNewShop(Shop shop);
	
}
