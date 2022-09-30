package com.syntax.project1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		/*
		 * Using Scanner create an array of integer values. After the array is created,
		 * calculate the sum of all stored elements in that array.
		 */

		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many integer values you want to perform Addition?");
		int num = input.nextInt();
		int[] numbers = new int[num];
		System.out.println("Please Enter " + num + " different integers");
		for (int i = 0; i < num; i++) {
			int number = input.nextInt();
			sum += number;
		}
		System.out.println("The Total Sum of " + num + " different number is " + sum + ".");
	}

}
