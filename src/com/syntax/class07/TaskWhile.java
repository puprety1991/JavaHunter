package com.syntax.class07;

public class TaskWhile {
	public static void main(String[] args) {
		//Print numbers from 100 to 1

//Print even numbers from 20 to 100 

//Print only odd numbers from 100 to 1
		
		int num =100;
		while(num>=1) {
			System.out.print(num+" ");
			num--;
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		int e = 20;
		while(e<=100) {
			System.out.print(e+" ");
			e+=2;
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		int odd =99;
		while(odd>=1) {
			
			System.out.print(odd+" ");
			odd-=2;
		}
		System.out.println();
		System.out.println("---------------------> Different Way <------------------------------");
		
	

	}

}
