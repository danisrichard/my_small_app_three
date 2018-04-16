package com.example.learn_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

	@GetMapping("/")
	public String loadIndexPage() {
		return "index";
	}
}
