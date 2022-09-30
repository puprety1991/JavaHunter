package com.syntax.project1;

public class Task6 {

	public static void main(String[] args) {

		//  Write a program to swap 2 numbers without a temporary variable?
		
		int num1 = 32;
		int num2 = 34;
		System.out.println("--> Before swapping <--");
		System.out.println("num1 = "+num1);
		 System.out.println("num2 = "+num2);
		
		 num1 = num1+num2;
		 num2 = num1-num2;
		 num1 = num1-num2;
		 
		 System.out.println();
		 System.out.println("--> After Swapping <--");
		 System.out.println("num1 = "+num1);
		 System.out.println("num2 = "+num2);
		 

	}

}
