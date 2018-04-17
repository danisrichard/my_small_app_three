package com.example.learn_project.entity;

public class ShopItem {
	private String itemName;
	private String description;
	private int itemValue;
	private int id;

	public ShopItem(String itemName, String description, int itemValue, int id) {
		this.itemName = itemName;
		this.description = description;
		this.itemValue = itemValue;
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getItemValue() {
		return itemValue;
	}

	public void setItemValue(int itemValue) {
		this.itemValue = itemValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}