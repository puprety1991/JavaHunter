package com.syntax.randomPractice.exercise.practice;

public class MorePattern {
	public static void main(String[] args) {
		/*
		 * 777777
		 * 6    6
		 * 5    5
		 * 4    4
		 * 3    3
		 * 2    2
		 * 111111
		 */
		for(int i=7; i>=1; i--) {
			for(int j=1; j<=6; j++) {
				if(i>=2 && i<=6 && j<6) {
						continue;	
						
					
					
				}else {
					System.out.print(i+" ");
					
				}
				
			}
			System.out.println();
		}
	}

}
