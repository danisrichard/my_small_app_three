package com.example.learn_project.entity;

public class ShopItem {
	private String itemName;
	private String description;
	private int itemValue;
	private int id;
	private int quantity;

	public ShopItem(String itemName, String description,int itemQuantity, int itemValue, int id) {
		this.itemName = itemName;
		this.description = description;
		this.itemValue = itemValue;
		this.quantity = itemQuantity;
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopItem other = (ShopItem) obj;
		if (id != other.id)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopItem [itemName=" + itemName + ", itemValue=" + itemValue + ", id=" + id + ", quantity=" + quantity
				+ "]";
	}
	
	
	
}
