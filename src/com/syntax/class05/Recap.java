package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		//short cut for  auto complete Ctrl + Space
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter phone model between (iphone, samsung, and nokia): ");
		String phone = input.next();
		
		if(phone.equals("iphone")) {
			System.out.println("I want to buy it for me");
			
		}else if (phone.equals("samsung")) {
			System.out.println("I want to buy it for my husband");
			
		}else if (phone.equals("nokia")) {
			System.out.println("I want to buy it for my grandma");
		}else {
			System.out.println("This is not a phone i am looking for");
		}

	}

}
