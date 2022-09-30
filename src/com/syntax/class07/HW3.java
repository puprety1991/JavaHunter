package com.syntax.class07;

public class HW3 {
	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		int i=20;
		while(i>=1) {
			System.out.print(i+" ");
			i-=2;
		}
		System.out.println();
		System.out.println("<----------Other Way------->");
		int num = 20;
		while(num>=1) {
			if(num % 2 == 0) {
				System.out.print(num+" ");	
				
			}
			num--;
			
		}
	}

}
