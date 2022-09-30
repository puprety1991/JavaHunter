package com.syntax.class05;

import java.util.Scanner;

public class TakeHomeWork01 {
	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring” 
if user is born in June, July, August → 
season =”Summer”  etc …
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("What is your birth Month? ");
		String month = input.nextLine();
		String season=null;
		
		if((month.equalsIgnoreCase("December")) || (month.equalsIgnoreCase("January")) || (month.equalsIgnoreCase("Febrauary"))) {
			season = "Winter";
		}else if ((month.equalsIgnoreCase("March")) || (month.equalsIgnoreCase("April")) || (month.equalsIgnoreCase("May"))) {
			season = "Spring";
		}else if ((month.equalsIgnoreCase("June")) || (month.equalsIgnoreCase("July")) || (month.equalsIgnoreCase("August"))) {
			season = "Summer";;
		}else if((month.equalsIgnoreCase("September")) || (month.equalsIgnoreCase("October")) || (month.equalsIgnoreCase("November"))) {
			season = "Autunm";
		}else {
			System.out.println("There is no such Month!");
			season = "-->> Invalid <<--";
		}
		System.out.println(season);
		
	}

}
