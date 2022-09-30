package com.syntax.class04;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house,
		 *  otherwise user will consider buying. Once user decides to buy a house, 
		 *  if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash
            ou are a loan specialist and you need to ask user what is the amount of loan is needed. 
            If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the mortgage rate: ");
		double mortRate = input.nextDouble();
		if(mortRate>4.5) {
			System.out.print("We are not interest to buy house.");
		}else {
			
		System.out.print("Please Enter the mortgage price: ");
		double mortPrice = input.nextDouble();
		if(mortPrice>200000) {
			System.out.print("Please Enter loan money: ");
			double loanPrice = input.nextDouble();
			if(loanPrice<=200000) {
				System.out.print("Congratulations for the loan.");
			}else {
				System.out.print("Sorry !! You are not eligible for loan amount.");
			}
			
		}else {
			System.out.print("We purchase house price in cash.");
			
		}
		
			}
		}
	}


