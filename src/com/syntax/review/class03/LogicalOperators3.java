package com.syntax.review.class03;

public class LogicalOperators3 {
	public static void main(String[] args) {
		String country = "north korea";
		//if(country.equalsIgnoreCase("Turkey") || (country.equalsIgnoreCase("Japan")) || (country.equalsIgnoreCase("Spain"))){
		if(!country.equalsIgnoreCase("North Korea")) {
			
			System.out.println("Welcome to USA");
		}else {
			System.out.println("Not allowed!! Stay Away!!");
		}
	}

}
