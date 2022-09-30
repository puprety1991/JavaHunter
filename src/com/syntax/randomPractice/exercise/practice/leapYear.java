package com.syntax.randomPractice.exercise.practice;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to check if a year is leap year or not.
            If a year is divisible by 4 then it is leap year but 
            if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the Year: ");
		int year = input.nextInt();
		boolean isLeapYear =false;
		if(year % 4 == 0) {
			if(year%400 == 0) {
				isLeapYear = true;
			}
		}else {
			isLeapYear = false;
		}
		if(isLeapYear) {
			System.out.println(year+ " is a leap year.");
		}else {
			System.out.println(year+" is not leap year.");
		}
	}

}
