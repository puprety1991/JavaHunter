package com.syntax.project1;

public class Task3 {
	public static void main(String[] args) {

		/*
		 * Create a 2D array of integer values. Print the sum of all numbers
		 */

		int[][] number = {
				{ 1, 1, 1, 1, 1, 1 },
				{ 2, 2, 2, 2, 2 } };
		int sum = 0;
		for (int row = 0; row < number.length; row++) {
			for (int col = 0; col < number[row].length; col++) {
				sum += number[row][col];

			}

		}
		System.out.println("The Sum Of all Numbers: "+sum);
		System.out.println();
		 sum = 0;
		for(int[] num: number){
			for(int numbers : num){
				sum+=numbers;
			}

		}
		System.out.println("The Sum Of all Numbers: "+sum);

	}

}
