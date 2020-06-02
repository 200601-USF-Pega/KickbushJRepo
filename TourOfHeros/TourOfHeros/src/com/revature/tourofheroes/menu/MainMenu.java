package com.revature.tourofheroes.menu;

import java.util.Scanner;

import com.revature.tourofheroes.models.Hero;
import com.revature.tourofheroes.service.HeroService;

public class MainMenu {
	public void mainMenu() {
		
		Scanner heroScanner = new Scanner(System.in);
		
		System.out.println("Welcome to my tour of heroes app");
		System.out.println("What would you like to do?");
		System.out.println("[0] Create a hero?");
		System.out.println("[1] Exit");
		
		String selection = heroScanner.nextLine();
		
		HeroService heroService = new HeroService();
		
		switch(selection) {
		
		case "0": {
			heroService.createNewHero();
			System.out.println("Hero Created");
		}
		
		case "1": {
			break;
		}
		
		
		
		}

		
		
		
	}
}
