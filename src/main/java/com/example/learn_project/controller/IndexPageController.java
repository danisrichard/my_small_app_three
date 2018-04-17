package com.example.learn_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

	@GetMapping("/index")
	public String loadIndexPage(Model model) {
		model.addAttribute("games","Játékok");
		model.addAttribute("online","Online bolt");
		model.addAttribute("election","Szavazás");
		return "index";
	}
	
	@GetMapping("/")
	public String loadLoginPage() {
		return "login";
	}
}
