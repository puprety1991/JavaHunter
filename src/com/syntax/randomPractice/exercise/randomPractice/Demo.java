package com.syntax.randomPractice.exercise.randomPractice;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        String[] country = new String[2];
	        for (int i = 0; i < country.length; i++) {
	            System.out.println("Please enter country");
	            country[i] = input.next();
	        }
	        for (int i = 0; i < country.length; i++) {
	            if (country[i].equals("Ukraine")) {
	                System.out.println("Kiev");
	            } else if (country[i].equals("Canada")) {
	                System.out.println("Toronto");
	            } else if (country[i].equals("USA")) {
	                System.out.println("Washington");
	            } else if (country[i].equals("Spain")) {
	                System.out.println("Madrid"); 
	}

}
}
}