package com.example.learn_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElectionPageController {

	@GetMapping("/election")
	public String electionLoader() {
		return null;
	}
	
}