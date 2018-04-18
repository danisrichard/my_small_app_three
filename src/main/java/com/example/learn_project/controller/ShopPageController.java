package com.example.learn_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopPageController {
	
	@GetMapping("/shop-index")
	public String loadShopIndex(Model model) {
		return "shop/shop-index";
	}
}
