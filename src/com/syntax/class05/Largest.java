package com.syntax.class05;

public class Largest {

	public static void main(String[] args) {
		int n1 = 67100;
		int n2 = 799011;
		int n3 = 3032000;
		int largest = 0;
		
		if(n1 > n2 && n1 > n3) {
			largest = n1;

		}else if(n2 > n1 && n2 > n3) {

			largest = n2;
		}else if(n3 > n1 && n3 > n2) {
			largest = n3;
		}
		System.out.print(largest+" is the largest number ");
		if(largest % 2 == 0) {
			System.out.println("and it is an Even number.");
		}else {
			System.out.println("and it is an Odd number.");
		}
	}

}
