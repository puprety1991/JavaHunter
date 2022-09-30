package com.syntax.class04;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("How many years you have worked: ");
		int year = input.nextInt();
		if(year>=5) {
			System.out.print("Enter your Salary: ");
			double salary = input.nextDouble();
			if(salary>50000) {
				System.out.println("Congratulations!! You got the $5000 as a bonus.");
			}else {
				System.out.println("Congratulations!! You got the $3000 as a bonus.");
			}
			
		}else {
			System.out.println("Your are not eligible for the bonus. Wait "+(5-year)+" year more to be eligible.");
		}
		

	}

}
