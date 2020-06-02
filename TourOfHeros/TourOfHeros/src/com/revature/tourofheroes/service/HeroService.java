package com.revature.tourofheroes.service;

import java.util.Scanner;

import com.revature.tourofheroes.exceptions.InvalidHealthException;
import com.revature.tourofheroes.models.Hero;

public class HeroService {
	public boolean createNewHero() {
		
		
		//get user input 
		
		Scanner heroScanner = new Scanner(System.in);
		
		System.out.println("Please enter the hero's name");
		String heroName = heroScanner.nextLine();
		boolean createMoves = true;
		
		StringBuilder specialMoves = new StringBuilder();
		
		while (createMoves) {
			
			System.out.println("Please enter the hero's special moves, say done to stop.");
			
			String specialMoveInput = heroScanner.nextLine();
			
			if (specialMoveInput.equalsIgnoreCase("done")) {
				break;
			}
			else {
				
			specialMoves.append(specialMoveInput);
			
			specialMoves.append(",");
			}
			
		}
		
		String[] specialMovesArray = specialMoves.toString().split(",");
		
		Hero newHero = new Hero(heroName, specialMovesArray);
		
		System.out.println(newHero);
		
		return true;
	}
}
