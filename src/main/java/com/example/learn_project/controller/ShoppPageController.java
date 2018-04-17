package com.example.learn_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppPageController {
	
	@GetMapping("/shop-index")
	public String loadShopIndex() {
		return "shop/shop-index";
	}
}
