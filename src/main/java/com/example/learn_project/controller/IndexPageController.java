package com.example.learn_project.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.learn_project.dao.game.ScoreRepository;
import com.example.learn_project.service.ScoreInformationService;

@Controller
public class IndexPageController {
	
	private static final Logger logger = Logger.getLogger(IndexPageController.class);
	
	@Autowired
	private ScoreInformationService mcg;
	
	@Value("${app.version}")
	private String appVersion;
	
	@Value("${app.name}")
	private String appName;

	@GetMapping("/index")
	public String loadIndexPage(Model model) {
		
		logger.debug("this will appear as a log in mylogfile.log!");
		
		model.addAttribute("appVersion",appVersion);
		model.addAttribute("appName",appName);
		
		return "index";
	}
	
	@GetMapping("/")
	public String loadLoginPage() {
		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logooutPage() {
		
		// még nem müködik
		
		return "redirect:/login";
	}
	
}
