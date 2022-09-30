package com.syntax.project1;

public class Task4 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array or integer type where you will store odd 
		 * and even numbers. Develop a program which will identify/print 
		 * the even numbers only.
		 */

		int[][] numbers = {
				{43,43,20,4,32},
				{44,56,79,11,34}
		};System.out.println("List of Even Numbers are: ");
		for(int r =0; r<numbers.length; r++) {
			for(int c=0; c<numbers[r].length;c++) {
				if(numbers[r][c] %2 == 0) {
					System.out.print(numbers[r][c]+" ");
				}
			}
		}

	}

}
