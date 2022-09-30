package com.syntax.project1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops)
		 */

		System.out.println("--> Regular For Loop <--");

		Scanner input = new Scanner(System.in);
		
		String capital = null;
		int i;
		System.out.println("How many South Asian country do you know?");
		int num = input.nextInt();
		String[] countries = new String[num];

		System.out.println("Can you name them:");
		for (i = 0; i < countries.length; i++) {
			countries[i] = input.next();
			
			if (countries[i].equalsIgnoreCase("india")) {
				capital = "Delhi is a Capital of " + countries[i].toUpperCase() + ".";

			} else if (countries[i].equalsIgnoreCase("bhutan")) {
				capital = "Thimpu is a Capital of " + countries[i].toUpperCase() + ".";

			} else if (countries[i].equalsIgnoreCase("Bangladesh")) {
				capital = "Dhaka is a Capital of " + countries[i].toUpperCase() + ".";

			} else if (countries[i].equalsIgnoreCase("nepal")) {
				capital = "Kathmandu is a Capital of " + countries[i].toUpperCase() + ".";

			} else if (countries[i].equalsIgnoreCase("SriLanka")) {
				capital = "Colombo is a Capital of " + countries[i].toUpperCase() + ".";

			} else if (countries[i].equalsIgnoreCase("Pakistan")) {
				capital = "Islamabad is a Capital of " + countries[i].toUpperCase() + ".";

			} else if (countries[i].equalsIgnoreCase("Maldives")) {
				capital = "Male is a Capital of " + countries[i].toUpperCase() + ".";

			} else if (countries[i].equalsIgnoreCase("Afghanistan")) {
				capital = "Kabul is a Capital of " + countries[i].toUpperCase() + ".";

			} else {

				capital = countries[i].toUpperCase() + " is not a Located in South Asia.";

			}

			System.out.println(capital);

		}
		
		System.out.println("--> Enhanced For Loop <--");
		
		System.out.println();
		String capitals = null;
		System.out.println("How many South Asia country do you know?");
		int count = input.nextInt();
		String[] desh = new String[count + 1];
		System.out.println("Can you name them:");
		for (String country : desh) {

			country = input.nextLine();
			if (country.equalsIgnoreCase("india")) {
				capitals = "Delhi is a Capital of " + country.toUpperCase() + ".";

			} else if (country.equalsIgnoreCase("bhutan")) {
				capitals = "Thimpu is a Capital of " + country.toUpperCase() + ".";

			} else if (country.equalsIgnoreCase("Bangladesh")) {
				capitals = "Dhaka is a Capital of " + country.toUpperCase() + ".";

			} else if (country.equalsIgnoreCase("Nepal")) {
				capitals = "Kathmandu is a Capital of " + country.toUpperCase() + ".";

			} else if (country.equalsIgnoreCase("Sri Lanka")) {
				capitals = "Colombo is a Capital of " + country.toUpperCase() + ".";

			} else if (country.equalsIgnoreCase("Pakistan")) {
				capitals = "Islamabad is a Capital of " + country.toUpperCase() + ".";

			} else if (country.equalsIgnoreCase("Maldives")) {
				capitals = "Male is a Capital of " + country.toUpperCase() + ".";

			} else if (country.equalsIgnoreCase("Afghanistan")) {
				capitals = "Kabul is a Capital of " + country.toUpperCase() + ".";

			} else if (!country.isEmpty()) {

				capitals = country.toUpperCase() + " is not a Located in South Asia.";

			}
			if (capitals != null) {
				System.out.println(capitals);

			}

		}

	}

}
