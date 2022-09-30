package com.syntax.project1;

public class Task11 {
	public static void main(String[] args) {

		// Write a program to print out duplicate elements from an Array of Strings?

		String[] ele = { "Sam", "Rose", "Sam", "Bike", "Cycle", "Rose", "Umbrella", "Umbrella" };
		String duplicate = null;
		for (int i = 0; i < ele.length; i++) {
			for (int j = i + 1; j < ele.length; j++) {
				if (ele[i] == ele[j]) {
					System.out.println(ele[j] + " is a duplicate.");
				}
			}

		}

	}

}
