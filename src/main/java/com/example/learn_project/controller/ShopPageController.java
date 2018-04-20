package com.example.learn_project.controller;

import static org.assertj.core.api.Assertions.entry;
import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
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
	
	private static final Logger logger = Logger.getLogger(ShopPageController.class);
	
	@Autowired
	private ShopService shopService;
	
	private Map<ShopItem,Integer> shopCart = new HashMap<>();
	// miután updateOrders succes üríteni a map-et
	
	private List<ShopItem> shopItemList = new ArrayList<>();
	
	@GetMapping("/shop-index")
	public String loadShopIndexPage(Model model) {
		
		shopItemList = shopService.getAllShopItem();
		
		logger.debug("ItemList: " + shopItemList);
		
		model.addAttribute("shopItemList",shopItemList);
		
		return "shop/shop-index";
	}
	
	@GetMapping("/add-cart-element")
	public String loadShopCart(Model model, @RequestParam("itemID") int itemID, @RequestParam("quantity") int itemQuantity) {
		
		logger.debug("ItemID: " + itemID + " ,itemQuantity: " + itemQuantity);
		
		// lamdba <3
		
		ShopItem currentShopItem = shopItemList.stream()
												 .filter( p -> p.getId() == itemID)
												 .findFirst().get();
		
		logger.debug("Hashcheck: " + currentShopItem.hashCode());
		
		// int itemValue = shopCart.get(currentShopItem); //igy is meglehet nézni hogy tartalamzza-e az elemet, ha nem NULL a viszatérés
		// if(itemValue == null ) ....

		shopCart.put(currentShopItem, itemQuantity);
		
		model.addAttribute("shopCartHashMap",shopCart);
		
		return "shop/shop-cart";
	}
	
	@GetMapping("/update-order-list-quantity")
	public String updateItemListQuantity(Model model) {
		//not implemented
		return null;
	}
	
	@GetMapping("/delete-from-cart")
	public String deleteFromCart(Model model, @RequestParam("itemID") int deleteIDnumb) {
		
		logger.debug(" ID want to delete:  " + deleteIDnumb);
		
		shopCart.entrySet().removeIf(entry -> entry.getKey().getId() == deleteIDnumb);
		
		return "shop/shop-cart";
	}
	
	@GetMapping("/shop-form")
	public String shopForm(Model model) {
		
		logger.debug("Shop-form-list: " + shopCart.toString());
		
		model.addAttribute("shopCartHashMap",shopCart);
		
		return "shop/shop-form";
	}
	
	@PostMapping("/shop-confirm")
	public String shopConfirmation(Model model, @RequestParam("emailAddress")String emailAddress,@RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName) {
		
		return null;
	}
}
