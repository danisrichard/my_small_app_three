package com.example.learn_project.dao.election;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.learn_project.dao.BaseRepository;
import com.example.learn_project.entity.ElectionItems;

@Repository
public class ElectionRepository extends BaseRepository {

	private static final String SELECT_ALL_CHOICE = "SELECT election_name,election_desc FROM ELECTION_TABLE";
	private static final String INSERT_NEW_ITEM = "";
	private static final String SELECT_USER_ID = "SELECT election_id FROM ELECTION_TABLE where election_name = ?";

	public List<ElectionItems> selectAllElectionItem() {
		try {
			return queryList(SELECT_ALL_CHOICE, new ElectionMapper());
		} catch (Exception e) {
			return null;
		}
	}

	public void addNewElectionItem(String electionName, String desc) {

	}

	private class ElectionMapper implements RowMapper<ElectionItems> {
		@Override
		public ElectionItems mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new ElectionItems(rs.getString("election_name"), rs.getString("election_desc"));
		}
	}

}
