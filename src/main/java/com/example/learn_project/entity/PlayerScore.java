package com.example.learn_project.entity;

public class PlayerScore {
	private String playerName;
	private String score;
	
	public PlayerScore(String playerName, String score) {
		this.playerName = playerName;
		this.score = score;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
}
