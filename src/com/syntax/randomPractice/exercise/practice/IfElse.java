package com.syntax.randomPractice.exercise.practice;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".
 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Please enter your sex (m or f): ");
		String gender = input.next();
		System.out.println("What is your marital status(y or n): ");
		String status = input.next();
		if(gender.equals("f")) {
			System.out.println("She will work only in the urban areas.");
		}else if(gender.equals("m")) {
			if(age<40 && age>=20) {
				System.out.println("You may work anywhere");
			}else if(age<60 && age>=40) {
				System.out.println("You will work in urban areas only.");
			}else {
				System.out.println("Error");
			}
		}
		
	}

}
