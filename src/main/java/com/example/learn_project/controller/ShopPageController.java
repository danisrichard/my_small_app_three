package com.example.learn_project.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.learn_project.entity.ShopItem;
import com.example.learn_project.service.ShopService;

@Controller
public class ShopPageController {
	
	@Autowired
	private ShopService shopService;
	
	private Map<ShopItem,Integer> shopCart = new HashMap<>();
	// miután updateOrders succes üríteni a map-et
	
	@GetMapping("/shop-index")
	public String loadShopIndex(Model model) {
		
		List<ShopItem> shopItemList = shopService.getAllShopItem();
		
		model.addAttribute("shopItemList",shopItemList);
		
		return "shop/shop-index";
	}
	
	@GetMapping("/shop-cart-element")
	public String loadShopCart(Model model) {
		
		return null;
	}
	
	@GetMapping("/shop-form")
	public String shopForm() {
		return null;
	}
	
	@PostMapping("/shop-confirm")
	public String shopConfirmation(Model model, @RequestParam("emailAddress")String emailAddress,@RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName) {
		
		return null;
	}
}
