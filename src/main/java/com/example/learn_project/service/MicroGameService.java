package com.example.learn_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.learn_project.entity.MicroGamer;

@Service
public class MicroGameService {
	
	private int playerPoint;
	private int robotPoint;
	
	public ArrayList<String> whoWhoWinRound(String microGamer1) {
		
		String[][] moves = { { "rock", "paper", },
                { "scissors", "rock", },
                { "paper", "scissors", },
        };
        String choice;
        int num = 0;
        Random r = new Random();
        num = r.nextInt(3);

        ArrayList<String> resultList = new ArrayList<>();
        
        for (int i = 0; i < moves.length; i++ ) {
            if (i > 0)
<<<<<<< refs/remotes/origin/add_shop_backend
                System.out.print(", ");    
=======
>>>>>>> updates
            choice = moves[i][0];
        }
        
        choice = microGamer1.toLowerCase();
        
        
        resultList.add(moves[num][0]);
        
        if (choice.matches(moves[num][0])) {
            resultList.add("tie");
            playerPoint++;
            robotPoint++;
        } else if (choice.matches(moves[num][1])) {
            resultList.add("win");
            playerPoint++;
        } else {
            resultList.add("lose");
            robotPoint++;
        }
		
		return resultList;
	}
	
	public String getResult() {
		return (String) (playerPoint + " - " + robotPoint );
	}
	
}
