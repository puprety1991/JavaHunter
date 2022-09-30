package com.syntax.class07;

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...
		int i=1;
		String name = null;
		Scanner input = new Scanner(System.in);
		while(i<=3) {
			System.out.println("Please enter your name? ");
			name = input.nextLine();
			i++;
			System.out.println("-----------------> Result <-----------------");
			System.out.println("Good afternoon "+name);
			System.out.println();
		}
		
			
		}
	
		

}
