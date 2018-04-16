package com.example.learn_project.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.learn_project.entity.Person;

@Controller
public class PersonController {
	
	@Value("${version}")
	private String version;
	
	@GetMapping("/")
	public String helloWorld(Model model) throws IOException {
		Person personObject = new Person("MicroGame1");
		Person personObject_02 = new Person("MicroGame2");
		
		model.addAttribute("game1",personObject.getName());
		model.addAttribute("game2",personObject_02.getName());
		
		System.out.println(version);
		
		
		/*
		try {
		InputStream is = this.getClass().getResourceAsStream("application.properties");
		Properties p = new Properties();
		p.load(is);
		String version = p.getProperty("version");
		String bar = p.getProperty("bar");
		System.out.println(version);
		System.out.println(bar);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		*/
		return "index";
	}
}
