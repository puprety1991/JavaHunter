package com.syntax.class07;

import java.util.Scanner;

public class JobWithWhileLoop {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		String ans;
		
		System.out.println("Did you get a job?");
		ans = ask.nextLine();
		
		while(!ans.equalsIgnoreCase("Yes")) {
			System.out.println("Did you a get a job?");
			ans = ask.nextLine();
			
		}
		System.out.println("-------> Congratulations!! <-------");
	}

}
