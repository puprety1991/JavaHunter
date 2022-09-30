package com.syntax.class07;

public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the factorial number of given 
		int num1 = 6;
		int count=1;
		int fact =1;
		
		while(count<=num1) {
			fact*=count;
			count++;
		}
		System.out.println("The factorial of "+num1+" is "+fact+".");

	}

}
