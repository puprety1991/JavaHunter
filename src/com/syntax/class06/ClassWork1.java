package com.syntax.class06;

import java.util.Scanner;

public class ClassWork1 {
	public static void main(String[] args) {
		
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, 
		 * any other grade --> Not Acceptable. At the end your program should print 
		 * which grade was entered by a user with explanation.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("What grade you get?");
		String grade = input.nextLine();
		String def;
		
		switch(grade) {
		case "A":
			def = "Excellent";
			break;
		case "B":
			def = "Good";
			break;
		case "C":
			def = "Average";
			break;
		case "D":
			def = "Bad";
			break;
		default:
			def = "Invalid";
			break;
			}
		System.out.println("'"+grade+"' is the "+def+" grade.");
	}

}
