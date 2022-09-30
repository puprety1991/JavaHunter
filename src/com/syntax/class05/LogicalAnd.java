package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {
		boolean understandJava = true;
		boolean enjoyJava = true;
		boolean practice = false;
		
		if(understandJava && enjoyJava && practice) {
			System.out.println("It is true statement.");
		}else {
			System.out.println("It is false statement.");
		}
		System.out.println("*************************");
		int n1 = 67100;
		int n2 = 79900;
		int n3 = 30320;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1+ " is largest number");
		}else if(n2 > n1 && n2 > n3) {
			System.out.println(n2+" is largest number");
		}else if(n3 > n1 && n3 > n2) {
			System.out.println(n3+ " is largest number");
		}
	}

}
