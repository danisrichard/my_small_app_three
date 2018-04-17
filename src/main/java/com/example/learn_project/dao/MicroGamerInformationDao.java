package com.example.learn_project.dao;

import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MicroGamerInformationDao extends BaseRepository{
	private static final String SELECT_TESZT = "SELECT first_name FROM DEV_TABLE_02 WHERE ID IN 1";
	
	public String tesztQuery() {
		return queryObject(SELECT_TESZT, SingleColumnRowMapper.newInstance(String.class));
	}
}
