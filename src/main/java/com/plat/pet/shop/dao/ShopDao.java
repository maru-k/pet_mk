package com.plat.pet.shop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plat.pet.cmm.PetDaoSupport;
import com.plat.pet.shop.model.Shop;
@Repository
public class ShopDao extends PetDaoSupport{
	
	public List<Shop> selectShopList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shop selectShopInfo(String shopId) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("shop.selectShopInfo", shopId);
	}

	public int insertNewShop(Shop shop) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("shop.insertNewShop", shop);
	}
	
}
