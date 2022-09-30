package com.syntax.randomPractice.exercise.practice;

import java.util.Scanner;

public class LoopPractice01 {
	public static void main(String[] args) {
		/*
		 * Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int power=1;
		
		for (int i = 1; i<=num2;i++) {
			power = power * num1;
			
		}
		System.out.println("The answer is: "+power);
		
	}

}
