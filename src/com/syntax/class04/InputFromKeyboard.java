package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {
	public static void main(String[] args) {
		/*
		 * Scanner is a class that helps us take the input from the keyboard. 
		 * it contains many different smaller modules called method that can help us take 
		 * String boolean basically all types of data from the keyboard.
		 */
		
		Scanner input = new Scanner(System.in); 
		// A message will be displayed to the user on the console to enter his/her name
		System.out.print("Please Enter your name: ");
		String name = input.next();
		System.out.print("Please Enter you last name:");
		String lname = input.next();
		System.out.print("Please enter your wife name:");
		//Activates the java Program to take the input from the keyboard and store it inside the name variable
		String wifename = input.next();
		// prints whatever name user enters on the keyboard on the console
		System.out.println("Hello my name is "+name+" "+lname+" and my wife name is "+wifename+".");
		
		
	
		
	}

}
