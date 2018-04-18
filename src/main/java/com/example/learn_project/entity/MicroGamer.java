package com.example.learn_project.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.mockito.internal.util.StringUtil;
import org.springframework.util.StringUtils;

public class MicroGamer {
	
	private boolean isRobot;
	private String playerName;
	private String choice;
	private List<String> listString;
	
	public MicroGamer(String name, boolean isRobot) {
		this.playerName = name;
		this.isRobot = isRobot;
	}
	
	public MicroGamer(String name,String resultList) {
		this.playerName = name;
		
		listString = new ArrayList<>();
		if(!StringUtils.isEmpty(resultList)) {
			listString = Arrays.asList(resultList.split(","));
		}
	}

	public boolean isRobot() {
		return isRobot;
	}

	public void setRobot(boolean isRobot) {
		this.isRobot = isRobot;
	}
	
	

	public List<String> getListString() {
		return listString;
	}

	public void setListString(List<String> listString) {
		this.listString = listString;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getChoice() {
		
		int randomNumb = (int)(Math.random()*3)+1;
		
		switch (randomNumb) {
		case 1 : return "ollo";
		case 2 : return "papir";
		case 3: return "ko";
		default:
			break;
		}
				
		return "semmi";
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
}
