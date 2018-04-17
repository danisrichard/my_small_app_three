package com.example.learn_project.entity;

public class ElectionItems {

	private String electionName;
	private String itemDescription;
	private String voteNumb;
	
	public ElectionItems(String electionName, String itemDescription) {
		this.electionName = electionName;
		this.itemDescription = itemDescription;
	}

	public String getElectionName() {
		return electionName;
	}

	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getVoteNumb() {
		return voteNumb;
	}

	public void setVoteNumb(String voteNumb) {
		this.voteNumb = voteNumb;
	}

}
