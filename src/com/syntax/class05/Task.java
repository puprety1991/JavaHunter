package com.syntax.class05;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		/*
* 1. Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)

2. Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, 
anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”

3. Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000
		 */
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please Enter the height in inches: "); 
		double inch = input.nextDouble();
		if(inch<60) {
			System.out.println("Your height is short.");
		}else if(inch>=60 && inch<= 72) {
			System.out.println("You have medium height.");
		}else {
			System.out.println("you are taller.");
		}
		
		
		System.out.println("*********************");
		System.out.println();
		
		int day = 6;        
		if(day >=1 && day<=5) {
			System.out.println(" It is a weekday");
		}else if(day == 6 || day == 7 ) {
			System.out.println("It is a weekend.");
		}else {
			System.out.println("Invalid day");
		}
		
		
		System.out.println("*********************");
		System.out.println();
		
		
		System.out.println("Please enter any number: ");
		int num = input.nextInt();
		if (num>=1 && num<=10) {
			System.out.println(num+ " is a small number");
		}else if(num>=11 && num <= 20 ) {
			System.out.println(num+ " is a medimum number");
		}else if (num>=101 && num<=1000) {
			System.out.println(num+" is large number");
		}else {
			System.out.println("Pleae input different number.");
		}
		
	}

}
