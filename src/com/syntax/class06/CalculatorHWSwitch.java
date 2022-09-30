package com.syntax.class06;

import java.util.Scanner;

public class CalculatorHWSwitch {
	public static void main(String[] args) {
		/*
		 * /*
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
		
		switch(operators) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;	
		case "*":
			result = num1 * num2;
			break;	
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid operator!!");
		}
		System.out.println(num1+" "+operators+" " +num2+" = "+result);
	}

}
