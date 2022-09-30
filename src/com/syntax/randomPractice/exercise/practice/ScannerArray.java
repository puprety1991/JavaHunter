package com.syntax.randomPractice.exercise.practice;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {
		// let's ask user how many names he would like to store and then store those
		// names

		Scanner scan;
		String[] names;
		int size;
		scan = new Scanner(System.in);
		System.out.println("How many names would you like to store");
		size = scan.nextInt();

		names = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter any name?");
			names[i] = scan.next();
		}
		for(int j=0; j<names.length; j++) {
			System.out.print(names[j]+" ");
		}
		
		
	}

}
