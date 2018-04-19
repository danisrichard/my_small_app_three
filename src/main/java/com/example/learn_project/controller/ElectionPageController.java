package com.example.learn_project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.learn_project.service.ElectionService;
import com.example.learn_project.entity.ElectionItem;

@Controller
public class ElectionPageController {

	@Autowired
	private ElectionService electionService;

	@GetMapping("/election")
	public String electionLoader(Model model) {

		List<ElectionItem> electionList = new ArrayList<>();
		
		electionList =  electionService.getAllElectionItems();

		if (!electionList.isEmpty()) {
			model.addAttribute("listOfElection", electionList);
		}
		
		return "election/election-index";
	}
	
	@PostMapping("/add-election")
	public String addNewElection(@RequestParam("gameName") String electionName, @RequestParam("gameDesc") String electionDescription) {
		
		boolean result = electionService.addNewChoiceElement(electionDescription, electionDescription);
		
		// majd visszajelezni a usernek hogy sikeres volt az új szavazás hozzáadása -> később
		
		System.out.println(result);
		
		return "redirect:/election" ;
	}

}
