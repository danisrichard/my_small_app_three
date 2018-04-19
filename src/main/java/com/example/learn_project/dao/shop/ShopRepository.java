package com.example.learn_project.dao.shop;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.learn_project.dao.BaseRepository;
import com.example.learn_project.entity.ShopItem;

@Repository
public class ShopRepository extends BaseRepository{
	
	private static final String SELECT_ALL_SHOP_ITEMS = "SELECT ";
	private static final String UPDATE_SHOP_ITEM = "";
	private static final String WHERE_ID ="";
	private static final String FIND_ORDERS_BY_ORDER_ID = "";

	public void updateShopItem(Map<ShopItem, Integer> shopItems) {
		
	}
	
	public List<ShopItem> getAllItemFromDB() {
		
		return null;
	}
	
	public Map<ShopItem, Integer> getItemsByOrderId(int orderID){
		return null;
	}
	
}
