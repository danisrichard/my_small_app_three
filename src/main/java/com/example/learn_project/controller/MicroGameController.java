package com.example.learn_project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.learn_project.entity.MicroGamer;

@Controller
public class MicroGameController {

	@GetMapping("/games-choice")
	public String loadGameChoice(Model model) {

		model.addAttribute("game1", "Kő-papir-olló!");
		model.addAttribute("game2", "Itt nincs játék, viszont kipróbálhatod a hibakezelést... ");

		List<String> listofResults = new ArrayList<>();

		if (listofResults.isEmpty()) {

			model.addAttribute("error", "Jeleneleg nincs megjelenithő adat - játsz egy párat :)");
		}else {
			
			model.addAttribute("listOfResult", listofResults);
		
		}
		return "/games";
	}

	@PostMapping("/micro-game-index")
	public String loadGamePage(Model model, @RequestParam("playerName") String name,
			@RequestParam("radio1") int number) {

		System.out.println(name + "  " + number);

		MicroGamer mg1 = new MicroGamer(name, false);
		MicroGamer mg2 = new MicroGamer("RobotPlayer", true);

		System.out.println(mg1.getPlayerName());
		System.out.println(mg2.getPlayerName());

		return "micro-game/micro-game-index";
	}

}
