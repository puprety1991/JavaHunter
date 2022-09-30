package com.syntax.randomPractice.exercise.practice;

public class PatternNumber {
	public static void main(String[] args) {
		int b;
		for(int a=0; a<=3; a++) {
			for( b=1; b<=5; b++) {
				if(a==1 && b==2) {
					System.out.println(" ");
					continue;
				}
				
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
