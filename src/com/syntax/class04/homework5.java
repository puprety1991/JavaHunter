package com.syntax.class04;

import java.util.Scanner;

public class homework5 {
	public static void main(String[] args) {
		
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, 
		 * tell them to pay off immediately, otherwise you can tell them that they can spend more
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Do you Have Credit card?(Please say yes or no): ");
		String decision = input.next();
		if(decision.equals("yes")) {
			System.out.print("What is the balance on your credit card? ");
			double bal = input.nextDouble();
			if(bal>1000) {
				System.out.print("Please pay off immdiately!");
			}else {
				System.out.print("You can spend more.");
			}
			
		}else if (decision.equals("no")) {
			System.out.println("We have excellent offer! If you are interested.");
		}else {
			System.out.println("Please enter valid input!");
		}
	}

}
