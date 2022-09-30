package com.syntax.randomPractice.exercise.practice;

public class WhileLoop {
	public static void main(String[] args) {
		int time =13;
		
		
		while(time>12) {
			System.out.println("Good day");
			time--;
		}
		// I want to print number 1 to 50
		int num=1;
		while(num<=10) {
			System.out.print(num+" ");
			num++;
		}
		// i want to print numbers from 10 to 30 only even numbers
		System.out.println("");
		System.out.println("Printing numbers 10 to 30 only Even --------");
		
		int e = 10;
		while(e<30) {
			System.out.print(e+" ");
			e+=2;
		}
		
	}

}
