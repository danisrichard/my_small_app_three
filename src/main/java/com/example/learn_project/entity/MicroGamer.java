package com.example.learn_project.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.mockito.internal.util.StringUtil;
import org.springframework.util.StringUtils;

public class MicroGamer {
	
	private boolean isRobot;
	private String playerName;
	
	public MicroGamer(String name, boolean isRobot) {
		this.playerName = name;
		this.isRobot = isRobot;
	}
	
	public MicroGamer(String name,String resultList) {
		this.playerName = name;
	}

	public boolean isRobot() {
		return isRobot;
	}

	public void setRobot(boolean isRobot) {
		this.isRobot = isRobot;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	
}
