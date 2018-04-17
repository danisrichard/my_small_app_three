package com.example.learn_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.learn_project.dao.MicroGamerInformationDao;
import com.example.learn_project.service.MicroGameInformationService;

@Controller
public class IndexPageController {
	
	@Autowired
	MicroGameInformationService mcg;

	@GetMapping("/index")
	public String loadIndexPage(Model model) {
		return "index";
	}
	
	@GetMapping("/")
	public String loadLoginPage() {
		
		System.out.println(mcg.tesztQuery());
		
		return "login";
	}
}
