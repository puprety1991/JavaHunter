package com.syntax.class09;

public class ForEachLoop {
	public static void main(String[] args) {
		//only when we deal with arrays or collections
		//we can use for each loop, enhanced for loop, advanced for loop
		String[] iceCream = {"Vanilla","Chocolate","Pistashio","Kulfi"};
		for(String flavour:iceCream) {
			
			System.out.println(flavour);
		}
		System.out.println("---------------");
		char[] grades = {'A','B','C','D','E','F'};
		for(char letter:grades) {
			System.out.print(letter+" ");
		}
		System.out.println("---------------");
		int[] numbers = {3,54,656,43,76,23};
		//get all element using regular for loop
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		System.out.println("----------");
		//get all values using enhanced for loop
		//this loop always loops 1 way: from start till end
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		
	}

}
