package com.syntax.class04;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a Java program that will ask user to input city and temperature.
		 *  Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter you City: ");
		String city = input.next();
		System.out.print("Please Enter you city's temperature: ");
		double fah = input.nextDouble();
		
		double cel;
		cel = ((fah-32)*5)/9;
		
		System.out.println("The temperature of my city is "+cel+"!");

	}

}
