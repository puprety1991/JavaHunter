package com.syntax.randomPractice.exercise.practice;

import java.util.Scanner;

public class Ultanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * A 4 digit number is entered through keyboard. 
 * Write a program to print a new number with digits reversed as of orignal one.
 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter four digit number: ");
		int num = input.nextInt();
		int first_digit = num%10;
		int second_digit = (num/10)%10;
		int third_digit = (num/100)%10;
		int fourth_digit = (num/1000)%10;
		int new_number = (first_digit*1000)+(second_digit*100)+(third_digit*10)+(fourth_digit*1);
		System.out.println("Reversed number: "+new_number);
	
	}

}
