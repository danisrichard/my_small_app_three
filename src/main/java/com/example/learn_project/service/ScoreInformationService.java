package com.example.learn_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn_project.dao.game.GamerRepository;
import com.example.learn_project.dao.game.ScoreRepository;
import com.example.learn_project.entity.MicroGamer;
import com.example.learn_project.entity.PlayerScore;

@Service
public class ScoreInformationService {

	@Autowired
	ScoreRepository scoreRepository;
	
	@Autowired
	GamerRepository gamerRepository;
	
	public List<PlayerScore> getAllResult() {
		return scoreRepository.getLatestResults();
	}
	
	public void setNewResults(String result,String name) {
		gamerRepository.updateResult(result,name);
	}
}
