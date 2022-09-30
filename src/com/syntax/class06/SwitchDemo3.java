package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * we need to ask a user where he/she is from
		 * base on the country --> define favorite food
		 */
		System.out.println("What country are you from?");
		String country = input.nextLine();
		String food;
		
		switch(country) {
		
		case "Nepal":
			food = "MoMo";
			break;
		case "USA":
			food = "Burger and Fries";
			break;
		case "Japan":
			food = "Sushi";
			break;
		case "India":
			food = "Chicken Curry";
			break;
		case "Itali":
			food = "Pizza";
			break;
		case "Kazakhstan":
			food ="beshparmak";
			break;
		case "Turkey":
			food = "Adana Kebab";
			break;
		case "Venezuela":
			food ="Arepa";
			break;
		case "Yemen":
			food = "Mandi";
			break;
		case "Afganistan":
			food = "Qaboli Palow";
			break;
		default:
			food ="Unknown";
			break;	
		}
		System.out.println("You are from "+country+" and your favourite food is "+food+".");
	}

}
