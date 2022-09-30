package com.syntax.class08;

import java.util.Scanner;

public class TrianglePatternUserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the size of the pattern");
		int size = input.nextInt();
		
		for(int i=size; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
