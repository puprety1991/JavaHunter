package com.syntax.review.class05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum=0;
		System.out.println("Please Enter the number of dresses you want to buy");
		int size = input.nextInt();
		double[] prices = new double[size];
		for(int i=0; i<size; i++) {
			System.out.println("Please enter the price for dress no "+(i+1));
			prices[i] = input.nextDouble();
		}System.out.println(Arrays.toString(prices));
		//Limitations of enhanced for loop
		//we can only to in one direction and can't skip the elements
		//we can't use enhanced for loop to update the elements in an array
		//we can only use it to access the elements
		for(double price: prices) {
			sum+=price;
			
		}
		System.out.println("The total bill of your purchased: "+sum);
	}
	

}
