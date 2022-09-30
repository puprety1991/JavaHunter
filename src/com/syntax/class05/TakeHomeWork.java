package com.syntax.class05;

import java.util.Scanner;

public class TakeHomeWork {
	public static void main(String[] args) {
		
		/*
		 * HW: 1. Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
		 */
		Scanner timeZone = new Scanner (System.in);
		System.out.println("What is your current time?(Please use 24 hours format): ");
		int currentTime = timeZone.nextInt();
		if(currentTime>=1 && currentTime<=11) {
			System.out.println("Morning");
		}else if(currentTime>=12 && currentTime<=15) {
			System.out.println("Afternoon");
		}else if (currentTime>=16 && currentTime<=20) {
			System.out.println("Evening");
			
		}else if(currentTime>=21 && currentTime<=24) {
			System.out.println("Night");
		}
	}

}
