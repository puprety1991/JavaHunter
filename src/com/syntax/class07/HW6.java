package com.syntax.class07;

import java.util.Scanner;

public class HW6 {
	public static void main(String[] args) {

		/*
		 * Declare a variable to store a price for a coffee. Ask the user to pay for a
		 * coffee. Keep asking to pay for coffee until the user enters the EXACT amount
		 * . If the user gives more than coffee price --> ask them to give less, if the
		 * user gives less money then ask to give more. Once user give EXACT amount
		 * print “Please enjoy your coffee
		 */

		Scanner input = new Scanner(System.in);
		double coffeePrice = 2.99;
		double price;
		double remain;
		do {
			System.out.println("Please make a payment for your Coffee:");
			price = input.nextDouble();
			if (price > coffeePrice) {
				remain = price - coffeePrice;
				System.out.println("Please give $" + remain + " less money!");
			} else if (price < coffeePrice) {
				remain = coffeePrice - price;
				System.out.println("Please give $" + remain + " more money!");
			}
		} while (coffeePrice != price);
		System.out.println("Please Enjoy Your Coffee!");

	}

}
