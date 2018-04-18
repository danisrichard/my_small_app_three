package com.example.learn_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn_project.dao.game.ScoreRepository;
import com.example.learn_project.entity.MicroGamer;

@Service
public class MicroGameInformationService {

	@Autowired
	ScoreRepository mcg;
	
	public List<MicroGamer> getAllResult() {
		return mcg.getLatestResults();
	}
	
	public void setNewResults(String result,String name) {
		mcg.updateResult(name, result);
	}
}
