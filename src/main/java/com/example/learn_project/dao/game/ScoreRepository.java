package com.example.learn_project.dao.game;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import com.example.learn_project.dao.BaseRepository;
import com.example.learn_project.entity.MicroGamer;
import com.example.learn_project.entity.PlayerScore;


@Repository
public class ScoreRepository extends BaseRepository {

	private static final String SELECT_LATEST_RESULTS = "SELECT user_name, score_result FROM MICRO_GAME_USER ORDER BY UPDATE_TIME";
	//private static final String UPDATE_GAMER_RESULT = "UPDATE MICRO_GAME_USER SET SCORE_RESULT = SCORE_RESULT || ',' || ?, UPDATE_TIME = SYSDATE WHERE USER_ID = ?";
	private static final String SELECT_GAMER_ID = "SELECT NVL( user_id, -1 ) FROM MICRO_GAME_USER WHERE user_name = ?";
	private static final String INSERT_NEW_USER = "INSERT INTO MICRO_GAME_USER VALUES( user_seq.NEXTVAL,?,SYSDATE)";
	private static final String INSERT_NEW_SCORE = "INSERT INTO LATEST_RESULT_TABLE(user_id,user_score,update_time) values (?,?,SYSDATE)";

	public List<PlayerScore> getLatestResults() {
		return queryList(SELECT_LATEST_RESULTS,new ResultMapper());
	}

	public void updateResult(String result, String name) {

		int user_id = -1;

		try {
			user_id = queryObject(SELECT_GAMER_ID, SingleColumnRowMapper.newInstance(Integer.class), name);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		if (user_id == -1) {
			update(INSERT_NEW_USER, name);
			updateResult( result, name);
			System.out.println("sikeres insert");
		} else {
			update(INSERT_NEW_SCORE, result, user_id);
			System.out.println("sikeres update");
		}

	}
	
	//ha NINCS DB-BEN OLYAN USER NÉV AKKOR ÚJAT LÉTREHOZNI 
	
	
	private class ResultMapper implements RowMapper<PlayerScore> {
		@Override
		public PlayerScore mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new PlayerScore(
				rs.getString("user_name"),
				rs.getString("score_result")
			);
		}
	}
	
}
