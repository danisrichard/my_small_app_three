package com.example.learn_project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.learn_project.entity.MicroGamer;
import com.example.learn_project.entity.PlayerScore;
import com.example.learn_project.service.ScoreInformationService;
import com.example.learn_project.service.MicroGameService;

@Controller
public class MicroGameController {
	
	@Autowired
	private MicroGameService microGameService;
	
	@Autowired
	private ScoreInformationService mGameInformationService;

	@GetMapping("/games-choice")
	public String loadGameChoice(Model model) {

		model.addAttribute("game1", "Kő-papir-olló!");
		model.addAttribute("game2", "Itt nincs játék, viszont kipróbálhatod a hibakezelést... ");

		List<PlayerScore> listofResults = new ArrayList<>();
		
		listofResults = mGameInformationService.getAllResult();
		
		if (listofResults.isEmpty()) {

			model.addAttribute("error", "Jeleneleg nincs megjelenithő adat - játsz egy párat :)");
		}else {
			
			model.addAttribute("listOfResult", listofResults);
		
		}
		return "/games";
	}

	@PostMapping("/micro-game-index")
	public String loadGamePage(Model model,HttpSession httpSession, @RequestParam("playerName") String name) {

		MicroGamer mg1 = new MicroGamer(name, false);
		MicroGamer mg2 = new MicroGamer("RobotPlayer", true);
		
		httpSession.setAttribute("mg1", mg1);
		httpSession.setAttribute("mg2", mg2);

		return "micro-game/micro-game-index";
	}
	
	@GetMapping("/playgame")
	public String playGame(Model model,HttpSession httpSession, @RequestParam("playerChoice") String playerChoice) {
				
		ArrayList<String> resultList = microGameService.whoWhoWinRound(playerChoice);
		
		model.addAttribute("matchResult",microGameService.getResult());
		model.addAttribute("latestResult", resultList.get(1).toUpperCase() + "!");
		model.addAttribute("robotChoice","Másik játékos választása: " + resultList.get(0).toUpperCase() + ".");
		
		return "micro-game/micro-game-current-result";
	}
	
	@GetMapping("/save-game")
	public String saveGame(HttpSession httpSession) {
		
		MicroGamer mg1 = (MicroGamer) httpSession.getAttribute("mg1");
		
		mGameInformationService.setNewResults(microGameService.getResult(), mg1.getPlayerName());
		
		return "redirect:/games-choice";
	}

}
