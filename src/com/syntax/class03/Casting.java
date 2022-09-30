package com.syntax.class03;

public class Casting {
	public static void main(String[] args) {
		/*
		 * type casting => converting one data type another data type
		 * why should i learn about type casting => so that we can use the that is written by somebody else to make 
		 * our life easier or when we will be working in teams we will be able to merge the code
		 * syntax for type casting =>
		 * when we are converting smaller to larger we don't need to do anything it happens automatically
		 * example => 
		 * int box =1234;
		 * long box2 = box; // this is how it works and it is called implicit or widening automatic conversion
		 * however when we convert a larger data type to smaller data
		 * example:
		 * long box =12345444;
		 * int box2 = (int) box; //this one is called narrowing or explicit or manual conversion
		 * 
		 */
		int num1 =(int)23.77;
		short box2 = 3333;
		byte smallerBox = (byte)box2; //byte has 8 bit and short has 16 bits.
		int smallerBox1 = (int)box2;
		long num2 = 3333333;
		float box3= 444444443;
		double box5 =434343443;
		
		char a = (char)67;
		System.out.println(a); // in asci 67 means c
		
		int newNum = (int)num2;
		long newNum1 = (long)num1;
		
		System.out.println(newNum);
		System.out.println(smallerBox1);
		
		System.out.println(smallerBox);
		
		System.out.println(num1);
		
	}

}
