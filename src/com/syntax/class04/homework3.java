package com.syntax.class04;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver licence to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter you age: ");
		double age = input.nextDouble();
		if(age>=18) {
			System.out.println("You will get the License.");
		}else {
			System.out.println("You should get learners permit first.");
		}

	}

}
