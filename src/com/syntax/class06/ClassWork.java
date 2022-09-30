package com.syntax.class06;

import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {
		/*
		 *  1. Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("What country are you from?");
		String country = input.nextLine();
		String language;
		
		switch(country.toLowerCase()) {
		case "nepal":
			language = "Nepali";
			break;
		case "pakistan":
			language = "Urdu";
			break;
		case "india":
			language = "Hindi";
			break;
		case "mexico":
			language = "Spanish";
			break;
		case "bhutan":
			language = "Jonkha";
			break;
		case "usa":
			language = "English";
			break;
		case "russia":
			language = "Russian";
			break;
		default:
			language = "Unknown";
			break;
			
		
		}
		System.out.println("You are from "+country+" and you speak "+language+" language.");
	}

}
