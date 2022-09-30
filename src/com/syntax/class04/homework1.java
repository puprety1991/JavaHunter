package com.syntax.class04;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		/*
		 * Write a program to store a boolean value of whether user has diploma or not. 
		 * If user has a diploma, you should say congratulations, 
		 * otherwise program should suggest to get a degree. Then if user has a degree program should check a gpa score. 
		 * If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, 
		 * otherwise → “You should have studied harder” 
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Do you have a Degree: ");
		boolean isDiploma = input.nextBoolean();
		if(isDiploma) {
			System.out.println("Congratulations for you Degree!!");
			
			System.out.print("Please Enter you GPA: ");
			double gpa = input.nextDouble();
			if(gpa>=3.5) {
				System.out.print("You are eligible for scholarship.");
			}else {
				System.out.println("You should have studied harder!");
			}
			
		}else {
			System.out.println("You should get a Degree!");
		}
	}

}
