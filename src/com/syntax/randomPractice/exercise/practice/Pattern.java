package com.syntax.randomPractice.exercise.practice;

public class Pattern {
	public static void main(String[] args) {
		/*
			777777
			666666
			555555
			444444
			333333
			222222
			111111
		 */
		for(int r=7; r>=1; r--) {
			for(int c=0; c <=6; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		/*
		 * 7654321
		 * 7654321
		 * 7654321
		 * 7654321
		 * 7654321
		 */
		System.out.println("-------");
		for(int i=1; i<=5; i++) {
			for(int j=7; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for (int line = 1; line <= 5; line++) {
			for (int j = 1; j <= (-1 * line + 5); j++) {
			System.out.print(".");
			}
			for (int k = 1; k <= line; k++) {
			System.out.print(line);
			}
			System.out.println();
			}
	}

}
