package com.syntax.review.class03;

public class LogicalOperators2 {
	public static void main(String[] args) {
		
		boolean iceCream = true;
		boolean fruit = true;
		boolean tacoTruck = false;
		
		if(tacoTruck || iceCream || fruit) {
			System.out.println("I am good for midnight snacks.");
		}else {
			System.out.println("I should buy something for midnight snack.");
		}
	}

}
