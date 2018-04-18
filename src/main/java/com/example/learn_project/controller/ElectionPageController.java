package com.example.learn_project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.learn_project.service.ElectionService;
import com.example.learn_project.entity.ElectionItems;

@Controller
public class ElectionPageController {

	@Autowired
	ElectionService electionService;

	@GetMapping("/election")
	public String electionLoader(Model model) {

		List<ElectionItems> electionList = new ArrayList<>();

		if (!electionList.isEmpty()) {
			model.addAttribute("listOfElection", electionList);
		}
		return "election/election-index";
	}
	
	@GetMapping("/election-post")
	public String addNewElection() {
		return null;
	}

}
