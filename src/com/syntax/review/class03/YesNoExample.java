package com.syntax.review.class03;

import java.util.Scanner;

public class YesNoExample {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Are you from batch 14?");
		String batch14 = input.next();
		if(batch14.equalsIgnoreCase("yes")) {
			System.out.println("You are amazing!");
		}else {
			System.out.println("You are good");
		}
	}

}
