package com.example.learn_project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BaseRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	protected <T> List<T> queryList(String sql, RowMapper<T> rowMapper, Object... args) {
		return jdbcTemplate.query(sql, rowMapper, args);
	}

	protected <T> T queryObject(String sql, RowMapper<T> rowMapper, Object... args) {
		return jdbcTemplate.queryForObject(sql, rowMapper, args);
	}

	protected void update(String sql, Object... args) {
		jdbcTemplate.update(sql, args);
	}

	protected void batchUpdate(String sql, BatchPreparedStatementSetter pss) {
		jdbcTemplate.batchUpdate(sql, pss);
	}
}

