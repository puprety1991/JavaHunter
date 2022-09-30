package com.syntax.class09;

public class HW5 {
	public static void main(String[] args) {
		/*
		 * Create an array to store char values and then print those in reverse order
		 */
		char[] letter = { 'A', 'M', 'E', 'R', 'I', 'C', 'A' };
		System.out.println("--> Original Order <--");
		for (int j = 0; j < letter.length; j++) {
			System.out.print(letter[j] + " ");
		}
		System.out.println();
		System.out.println("--> Reverse Order <--");
		for (int i = letter.length - 1; i >= 0; i--) {
			System.out.print(letter[i] + " ");

		}

	}

}
