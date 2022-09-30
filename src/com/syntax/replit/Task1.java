package com.syntax.replit;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)

If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"

Based on the score define users eligibility:

- if score is below  600 --> eligibility = "Not eligible"
- if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
- if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
- if score is higher than any other previous values --> eligibility = "Definitely eligible" . 
		 */
		Scanner input =  new Scanner(System.in);
		   System.out.println("Do you need a loan?");
		   boolean decision = input.nextBoolean();
		   String result = "null";

		   if(decision){
		     System.out.println("What is your credit score?");
		     int score = input.nextInt();
		     if(score>800){
		       result = "Definitely eligible";
		     }else if(score>=701 && score<=800){
		       result = "Eligible";     
		     }else if(score>=600 && score<=700){
		       result = "Maybe eligible";
		     }else if(score<600){
		       result = "Not eligible";
		     }
		      System.out.println("The eligibility is "+result);
		   }else{
		     System.out.println("Unknown");
		   }

	}

}
