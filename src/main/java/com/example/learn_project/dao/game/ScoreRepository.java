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

	private static final String SELECT_LATEST_RESULTS = "SELECT user_name,user_score FROM LATEST_RESULT_TABLE ltr, MICRO_GAME_USER mgu WHERE ltr.user_id = mgu.user_id";
	//private static final String UPDATE_GAMER_RESULT = "UPDATE MICRO_GAME_USER SET SCORE_RESULT = SCORE_RESULT || ',' || ?, UPDATE_TIME = SYSDATE WHERE USER_ID = ?";
	
	public List<PlayerScore> getLatestResults() {
		return queryList(SELECT_LATEST_RESULTS,new ResultMapper());
	}
	
	private class ResultMapper implements RowMapper<PlayerScore> {
		@Override
		public PlayerScore mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new PlayerScore(
				rs.getString("user_name"),
				rs.getString("user_score")
			);
		}
	}
	
}
