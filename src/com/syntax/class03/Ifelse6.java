package com.syntax.class03;

public class Ifelse6 {
	public static void main(String[] args) {
		int number = 19;
		if(number != 18) {
			System.out.println("This is number is not 18");
		}else {
			System.out.println("This number is 18");
		}
		int day =4;
		if(day == 1) {
			System.out.println("Monday");
		}else if (day == 2) {
			System.out.println("Tuesday");
			
		}else if(day == 3) {
			System.out.println("Wednesday");
		}else if(day == 4) {
			System.out.println("Thursday");
		}else if(day == 5) {
			System.out.println("Friday");
		}else if(day == 6 ) {
			System.out.println("Satuarday");
		}else if(day == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Please insert between (1-7)");
		}
	}

}
