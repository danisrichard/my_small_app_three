package com.example.learn_project.entity;

public class MicroGamer {
	
	private boolean isRobot;
	private String playerName;
	private int result;
	private String choice;
	
	public MicroGamer(String name, boolean isRobot) {
		this.playerName = name;
		this.isRobot = isRobot;
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

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}	
	
}
