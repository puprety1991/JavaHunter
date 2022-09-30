package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter your age: ");
		int age = input.nextInt();
		
		if(age<18) {
			System.out.println("You should focus on study.");
		}else {
			System.out.println("You should start working.");
		}
		
	}

}
