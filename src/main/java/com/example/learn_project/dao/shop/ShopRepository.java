package com.example.learn_project.dao.shop;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.learn_project.dao.BaseRepository;
import com.example.learn_project.entity.PlayerScore;
import com.example.learn_project.entity.ShopItem;

import oracle.jdbc.driver.DatabaseError;

@Repository
public class ShopRepository extends BaseRepository {

	private static final String SELECT_ALL_SHOP_ITEM = "SELECT item_name,item_desc,item_quantity,item_value,item_id FROM SHOP_ITEMS";
	private static final String UPDATE_SHOP_ITEM = "";
	// private static final String WHERE_ID ="";
	private static final String FIND_ORDERS_BY_ORDER_ID = "";

	public void updateShopItem(Map<ShopItem, Integer> shopItems) {
		 
	}

	public List<ShopItem> getAllItemFromDB() {
		return queryList(SELECT_ALL_SHOP_ITEM, new ShopMapper());
	}

	public List<ShopItem> getItemsByOrderId(int orderID) {
		return null;
	}

	private class ShopMapper implements RowMapper<ShopItem> {
		@Override
		public ShopItem mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new ShopItem(
					rs.getString("item_name"),
					rs.getString("item_desc"),
					rs.getInt("item_quantity"),
					rs.getInt("item_value"),
					rs.getInt("item_id"));
		}
	}
}
