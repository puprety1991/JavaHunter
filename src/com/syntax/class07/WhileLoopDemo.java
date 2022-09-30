package com.syntax.class07;

public class WhileLoopDemo {
	public static void main(String[] args) {
		//print all numbers from 1 to 10
		
		int count =1;
		int num=10;
		
		while(count<=num) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		int num1=10;
		
		while(num1<=25) {
			System.out.print(num1+" ");
			num1++;
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		//print all numbers from 10 to 1
		int count1 =10; 
		while(count1>=1) {
			System.out.print(count1+" ");
			count1--;
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		// print all numbers from 50 to 20
		//all even numbers from 1 to 20
		
		int a = 50;
		while(a>=20) {
			System.out.print(a+" ");
			a--;
		}
		System.out.println();
		int b =2;
		
		while(b<=20) {
			System.out.print(b+" ");
				b+=2;
			}
		}
				
	

}
