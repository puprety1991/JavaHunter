package com.syntax.class05;

import java.util.Scanner;

public class NextVsNextLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name: ");
		String fName = scan.nextLine();
		System.out.println("Please enter your next full name");
		System.out.println(fName);
	}

}
