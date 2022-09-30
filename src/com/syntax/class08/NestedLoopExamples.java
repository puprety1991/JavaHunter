package com.syntax.class08;

public class NestedLoopExamples {
	public static void main(String[] args) {
		//car
		for(int a=0; a<=9; a++) {
			for(int b=0; b<=9; b++) {
				for(int c=0; c<=9; c++) {
					System.out.println(a+"-"+b+"-"+c);
					
				}
				
			}
			
		}
		//multiplication table
		int total;
		
		for(int i = 1; i<=10; i++) {
			System.out.println();
			System.out.println("Multiplication Table of "+i);
			System.out.println();
			for(int j=1; j<=10; j++) {
				total = i*j;
				System.out.println(" ("+i+" X "+j+") = "+total);
				
			}
			
		}
			
	}

}
