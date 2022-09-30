package com.syntax.class09;

public class HW3 {
	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */
		int sum = 0;
		int sumO = 0;
		int[] num = { 4, 6, 3, 6, 2, 9, 54, 76, 34, 76 };
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("--> Using regular For Loop <--");
		System.out.println("The Sum is: " + sum);
		System.out.println();
		for (int numb : num) {
			sumO += numb;

		}
		System.out.println("--> Using Enhanced For Loop <--");
		System.out.println("The Sum is: " + sum);
	}

}
