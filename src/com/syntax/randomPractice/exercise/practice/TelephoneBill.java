package com.syntax.randomPractice.exercise.practice;

public class TelephoneBill {

	public static void main(String[] args) {
		/*
		 * The local telephone company NkuTel offers long distance phone service to residential and commercial
customers with separate rate structures for the two types of customer. Residential customers are charged a
weekly rate of $5 plus 10 cents per minute for each minute over 60. Commercial customers are charged 20
cents per minute for the first 300 minutes and for each minute over 300, the rate is 15 cents per minute. NkuTel
has hired you to write a program that its accounting department can use to compute the weekly long distance
bill for a customer. 
		 */
		
		boolean resident = true;
		boolean commercial = false;;
		int residenCharge = 5;
		double reextraCharge = 0.10;
		int minutesTalk =90;
		double total;
		double remaining;
		double charge;
		double totalCharge;
		
		
		double commercialCharge = 0.20;
		double commercialExtraCharge = 0.15;
		double commercialMinute = 301;
		
		
		if(resident) {
			if(minutesTalk<=60&& minutesTalk>0) {
				System.out.println("Your weekly charged is $"+residenCharge);
			}else if(minutesTalk>60) {
				remaining = minutesTalk - 60;
				charge = remaining * reextraCharge;
				totalCharge = residenCharge + charge;
				System.out.println("You total charge is $"+totalCharge);			     
			}else {
				System.out.println("Invalid Minute!!");
			}
			
		}else if(commercial) {
			if(commercialMinute<=300 && commercialMinute>0)
			{
				charge = commercialMinute * commercialCharge;
				System.out.println("Your total bill is $"+charge+".");
				
			}else if(commercialMinute>300) {
				charge = commercialMinute *commercialExtraCharge;
				System.out.println("Your total bill is $"+charge);
			}else {
				System.out.println("Invalid Minute!!");
			}
		}

	}

}
