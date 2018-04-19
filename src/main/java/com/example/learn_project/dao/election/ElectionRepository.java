package com.example.learn_project.dao.election;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import com.example.learn_project.dao.BaseRepository;
import com.example.learn_project.entity.ElectionItem;

@Repository
public class ElectionRepository extends BaseRepository {

	private static final String SELECT_ALL_CHOICE = "SELECT election_name,election_desc FROM ELECTION_TABLE";
	private static final String INSERT_NEW_ITEM = "INSERT INTO ELECTION_TABLE VALUES( election_seq.NEXTVAL,?,?,0 )";
	private static final String SELECT_ELECTION_ID = "SELECT election_id FROM ELECTION_TABLE where election_name = ?";

	public List<ElectionItem> selectAllElectionItem() {
		try {
			return queryList(SELECT_ALL_CHOICE, new ElectionMapper());
		} catch (Exception e) {
			return null;
		}
	}

	public boolean addNewElectionItem(String electionName, String desc) {
		int election_id = -1;
		
		try {
			election_id = queryObject(SELECT_ELECTION_ID, SingleColumnRowMapper.newInstance(Integer.class), electionName);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		if(election_id != -1) {
			return false;
		}
		
		update(INSERT_NEW_ITEM, electionName,desc);
		
		return true;
	}

	private class ElectionMapper implements RowMapper<ElectionItem> {
		@Override
		public ElectionItem mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new ElectionItem(rs.getString("election_name"), rs.getString("election_desc"));
		}
	}

}
