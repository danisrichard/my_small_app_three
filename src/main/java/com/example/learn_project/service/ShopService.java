package com.example.learn_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn_project.dao.shop.ShopRepository;

@Service
public class ShopService {
	
	@Autowired
	ShopRepository shopRepository;
	
	
}
