package com.syntax.class07;

public class HW4 {
	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		int i = 21;
		while (i <= 50) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
		System.out.println("<----------Other Way------->");
		int num = 20;
		while (num <= 50) {
			if (num % 2 == 1) {
				System.out.print(num + " ");

			}
			num++;

		}
	}
}
