package com.example.learn_project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn_project.dao.shop.ShopRepository;
import com.example.learn_project.entity.ShopItem;

@Service
public class ShopService {

	@Autowired
	ShopRepository shopRepository;

	public List<ShopItem> getAllShopItem() {
		return null;
	}

	public void updateOrders(Map<ShopItem, Integer> shopItems) {
			shopRepository.updateShopItem(shopItems);
	}
	
	public Map<ShopItem, Integer> getItemsByOrderId(int orderID){
		return null;
	}

}
