package com.example.learn_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn_project.dao.election.ElectionRepository;
import com.example.learn_project.entity.ElectionItem;

@Service
public class ElectionService {
	
	@Autowired
	ElectionRepository electionRepository;
		
	public List<ElectionItem> getAllElectionItems(){
		return electionRepository.selectAllElectionItem();
	}
	
	//not implemented
	public List<ElectionItem> getAllElectionItems(String orderValue){
		return electionRepository.selectAllElectionItem();
	}
	
	public boolean addNewChoiceElement(String name,String desc) {
		return electionRepository.addNewElectionItem(name, desc);
	}
}
