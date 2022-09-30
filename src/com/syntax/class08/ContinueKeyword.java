package com.syntax.class08;

public class ContinueKeyword {
	public static void main(String[] args) {
		for(int i=1; i<5; i++) {
			if(i == 3) {
				continue;
				
			}
			
			
			System.out.print(i++);
			System.out.println();
		}
		// I want to print numbers from 1 to 20 except numbers 6,7 and 8
		for(int i =1; i<=20; i++) {
			if(i ==3 || i ==7 || i==8) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
