package com.syntax.class08;

public class Task {
	public static void main(String[] args) {
		// from the range of 1 to 50. Please find the sum of all even and odd number.

		double sumE = 0;
		double sumO = 0;

		for (int i = 2; i <= 50; i += 2) {
			sumE += i;
		}
		System.out.println("Sum of Even number (between 1 to 50): " + sumE);
		for (int i = 1; i <= 49; i += 2) {
			sumO += i;
		}
		System.out.println("Sum of Odd number (between 1 to 50): " + sumO);

	}

}
