package com.example.learn_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn_project.dao.election.ElectionRepository;
import com.example.learn_project.entity.ShopItem;

@Service
public class ElectionService {
	
	@Autowired
	ElectionRepository electionRepository;
	
	public List<ShopItem> getAllElements() {
		return null;
	}
	
	public void addNewElement(ShopItem shopItem) {
		System.out.println(shopItem.getItemName());
	}
	
	
}
