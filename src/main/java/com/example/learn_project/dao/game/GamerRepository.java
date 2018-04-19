package com.example.learn_project.dao.game;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import com.example.learn_project.dao.BaseRepository;
import com.example.learn_project.entity.PlayerScore;

@Repository
public class GamerRepository extends BaseRepository{
	
	private static final String SELECT_GAMER_ID = "SELECT NVL( user_id, -1 ) FROM MICRO_GAME_USER WHERE user_name = ?";
	private static final String INSERT_NEW_USER = "INSERT INTO MICRO_GAME_USER VALUES( user_seq.NEXTVAL,?,SYSDATE)";
	private static final String INSERT_NEW_SCORE = "INSERT INTO LATEST_RESULT_TABLE(user_id,user_score,update_time) values (?,?,SYSDATE)";

	
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
			update(INSERT_NEW_SCORE, user_id, result);
			System.out.println("sikeres update");
		}

	}
	
	//ha NINCS DB-BEN OLYAN USER NÉV AKKOR ÚJAT LÉTREHOZNI 
	
}
