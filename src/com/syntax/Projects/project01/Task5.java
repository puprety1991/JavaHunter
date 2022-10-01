package com.syntax.Projects.project01;

public class Task5 {
	public static void main(String[] args) {

		/*
		 * Create a 2D array of integers. Develop a program which will calculate 
		 * the sum of even and odd numbers for that array.
		 */

		int sumE = 0;
		int sumO = 0;
		int[][] number = {
				{43,43,20,44,32},
				{50,56,79,11,34}
	};
		for(int[] num:number) {
			for(int numbers:num) {
				if(numbers %2 == 0) {
					sumE+=numbers;
				}else if( numbers %2 ==1) {
					sumO+=numbers;
				}
			}
			
		}
		System.out.println("The total Sum of Even numbers is "+sumE+".");
		System.out.println("The total Sum of Odd numbers is "+sumO+".");
		
	}

}
