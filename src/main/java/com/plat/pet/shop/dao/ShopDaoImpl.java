package com.plat.pet.shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plat.pet.shop.model.Shop;

@Repository
public class ShopDaoImpl implements ShopDao{

	@Autowired
	private SqlSession query;

	@Override
	public List<Shop> selectShopList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shop selectShopInfo(String shopId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertNewShop(Shop shop) {
		// TODO Auto-generated method stub
		query.insert("shop.insertNewShop", shop);
	}
	


}
