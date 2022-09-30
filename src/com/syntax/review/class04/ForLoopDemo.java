package com.syntax.review.class04;

public class ForLoopDemo {
	public static void main(String[] args) {
		// I want to print this pattern 10 8 6 4 2 0
		for(int i=10; i!=0; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----------------");
		// print 9 5 1
		
		for(int i=9; i>=1; i-=4) {
			System.out.print(i+" ");
		
		}
		System.out.println();
		System.out.println("----------------");
		// print 1 3 7 9
		
		for(int i=1; i<=9; i+=2){ 
			if(i == 5) { // if(i != 5); then print they sysowill get same output.
				continue;
			}
			System.out.println(i);
			
			
		}
	}

}
