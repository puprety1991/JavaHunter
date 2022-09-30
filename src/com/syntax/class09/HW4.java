package com.syntax.class09;

public class HW4 {
	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number.
		 */

		int[] num = { 54, 0, 234, -76, 43, 23, 98 };
		int largest = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}
		System.out.println("The largest number is: " + largest);
		System.out.println("--------");
		largest = num[0];
		for(int number:num) {
			if(number>largest) {
				largest = number;
			}
			
		}
		System.out.println("The largest number is: " + largest);
	}
	

}
