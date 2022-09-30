package com.syntax.class05;

import java.util.Scanner;

public class NestedRecap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Do you allergy? (Please answer true or false) ");
		Boolean allergy = input.nextBoolean();

		if (allergy) {
			System.out.println("Lets check what allergy you have: ");
			String allergyType = input.next();

			if (allergyType.equalsIgnoreCase("Pollen")) { // it will ignore the case sensitive
				System.out.println("Try to stay indoors.");
			} else if (allergyType.equals("peanut")) {
				System.out.println("Please stay away from peanuts");

			} else if (allergyType.equals("dairy")) {
				System.out.println("Stay away from dairy products");
			} else {
				System.out.println("We do not have in our database");
			}

		} else {
			System.out.println("You are lucky!");
		}

	}

}
// to format code use
//mac: cmd+shift+f