package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {

		Scanner timeZone = new Scanner(System.in);
		System.out.println("What is your current time?(Please use 24 hours format): ");
		int currentTime = timeZone.nextInt();
		String timeOfTheDay = null;

		if (currentTime >= 1 && currentTime <= 11) {
			timeOfTheDay = "Morning";

		} else if (currentTime >= 12 && currentTime <= 15) {
			timeOfTheDay = "Afternoon";

		} else if (currentTime >= 16 && currentTime <= 20) {
			timeOfTheDay = "Evening";

		} else if (currentTime >= 21 && currentTime <= 24) {
			timeOfTheDay = "Night";
		}else {
			System.out.println("Wrong Number Is Entered!");
			timeOfTheDay ="-->>> Invalid <<<--";
		}
		System.out.println(timeOfTheDay);
	}

}
