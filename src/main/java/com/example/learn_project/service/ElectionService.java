package com.example.learn_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn_project.dao.election.ElectionRepository;
import com.example.learn_project.entity.ElectionItems;

@Service
public class ElectionService {
	
	@Autowired
	ElectionRepository electionRepository;
		
	public List<ElectionItems> getAllElectionItems(){
		return electionRepository.selectAllElectionItem();
	}
	
	public void addNewChoiceElement(String name,String desc) {
		electionRepository.addNewElectionItem(name, desc);
	}
}
