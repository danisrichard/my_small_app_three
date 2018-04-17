package com.example.learn_project.service;

import org.springframework.stereotype.Service;

import com.example.learn_project.entity.MicroGamer;

@Service
public class MicroGameService {
	
	public void whoWhoWinRound(MicroGamer microGamer1, MicroGamer microGamer2) {
		String mg1 = microGamer1.getChoice();
		String mg2 = microGamer2.getChoice();
		
		System.out.println(mg1 + " - " + mg2);
	}
	
	public int getResults(MicroGamer mg1) {
		return mg1.getResult();
	}
	
}
