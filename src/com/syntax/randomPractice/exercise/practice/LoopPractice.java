package com.syntax.randomPractice.exercise.practice;

import java.util.Scanner;

public class LoopPractice {
	public static void main(String[] args) {
		
		/*
		 * Write a program to calculate the sum of first 10 natural number.
		 */
		int sum =0;
		
		for(int i=1;i<10;i++) {
			sum = sum+i;
			
		}
		System.out.println("Sum "+sum);
		System.out.println("-----------------------------------------");
		 //Write a program that prompts the user to input a positive integer. It should print the multiplication table of that number.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any positive integer: ");
		int num = input.nextInt();
		int i;
		int mult;
		for(i=1;i<=10;i++) {
			mult = num * i;
			System.out.println("The multiplication table of "+num+" * "+i+" = "+mult);				
		}
		System.out.println("-----------------------------------------------------");
		/*
		 * Write a program to find the factorial value of any number entered through the keyboard.
		 */
		System.out.println("Please entered any Number: ");
		int num1 = input.nextInt();
		int fact = 1;
	
		for(i=1;i<=num1;i++) {
			fact = fact * i;	
					
		}
		System.out.println("Factorial of "+num1+ " is "+fact);
		
	}
	

}




