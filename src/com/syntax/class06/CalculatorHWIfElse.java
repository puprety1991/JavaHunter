package com.syntax.class06;

import java.util.Scanner;

public class CalculatorHWIfElse {
	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Please Enter the Second number: ");
		int num2 = input.nextInt();
		
		System.out.println("What operation you want to perform?");
		String operators = input.next();
		
		int result = 0;
		boolean wrongOperator = false;
		
		if(operators.equalsIgnoreCase("Addition")) {
			result = num1 + num2;
		}else if(operators.equalsIgnoreCase("Subtraction")) {
			result = num1 - num2;
		}else if(operators.equalsIgnoreCase("Multiplication")) {
			result = num1 * num2;
		}else if(operators.equalsIgnoreCase("Division")) {
			result = num1 / num2;
		}else {
			System.out.println("Enter Valid Operators!");
			wrongOperator = true;
			
		}
		if(!wrongOperator) {
			System.out.println("Your result  after "+operators+ " is: "+result);
			
		}
		
		
	}

}
