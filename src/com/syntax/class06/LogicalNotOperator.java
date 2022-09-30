package com.syntax.class06;

public class LogicalNotOperator {
	public static void main(String[] args) {
		boolean bool = !true;
		System.out.println(bool); //  not operator reverse true to false
		boolean boo = !false;
		System.out.println(boo); // not operator reverse false to true
		boolean rain = true;
		if(!rain) {
			System.out.println("I will go for a walk");
		}else {
			String day = "Monday";
			if(!day.equalsIgnoreCase("Sunday")) {
				System.out.println("Today is no Sunday");
				
			}
			
			
			System.out.println("End the program");
		}
		System.out.println("-----***--------> Next Program <-------***--------");
		boolean checkboxSelected = false;
		if(!checkboxSelected) {
			System.out.println("I will click and select it.");
		}
		
	}

}
