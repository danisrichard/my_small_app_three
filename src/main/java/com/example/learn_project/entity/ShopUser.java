package com.example.learn_project.entity;

public class ShopUser {

	private String shopUserName;
	private String emailAddress;
	
	public ShopUser(String shopUserName, String emailAddress) {
		this.shopUserName = shopUserName;
		this.emailAddress = emailAddress;
	}
	public String getShopUserName() {
		return shopUserName;
	}
	public void setShopUserName(String shopUserName) {
		this.shopUserName = shopUserName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
}
