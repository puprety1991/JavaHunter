package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secret = 1234;
		int guess;
		
		do {
			System.out.println("Please guess the secret number: ");
			guess = input.nextInt();
			if(secret == guess) {
				System.out.println("You won!");
			}
		}while(guess != secret);
	
	}

}