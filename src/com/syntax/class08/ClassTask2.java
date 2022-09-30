package com.syntax.class08;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {

		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money, accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever user done with payments program should say
		 * "Thank you for shopping!"
		 */
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double price;
		double changed;
		System.out.println("What item do you want to buy?");
		String item = input.nextLine();
		System.out.print(" It costs $");
		price = input.nextDouble();

		do {
			System.out.println();

			System.out.print("Make a payment: $");
			double pay = input.nextDouble();
			sum += pay;
			if (sum < price) {
				changed = price - sum;
				System.out.println("$"+changed + " is left to pay off.");
			} else if (sum >= price) {

				changed = sum - price;
				if (changed == 0) {

					break;
				} else {
					System.out.println("$"+changed + " is your changed.");
					
					break;

				}

			}
		} while (sum != price);
		System.out.println("Thank you for shopping!!");

	}

}
