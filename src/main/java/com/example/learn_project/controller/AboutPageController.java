package com.example.learn_project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AboutPageController {

	@Value("${version}")
	private String appVersion;
	
	public String aboutPageLoader(Model model) {
		model.addAttribute("appVersion",appVersion);
		
		System.out.println(appVersion);
		
		return "about-page";
	}
}
