package com.syntax.class09;

public class Example {
	public static void main(String[] args) {
		String[] week = { "Sunday", "Tuesday", "Friday", "Thursday", "Monday" };
		for (String day : week) {
			if (day.equalsIgnoreCase("Sunday")) {
				System.out.println(day + " is Fun Day.");
			} else {
				System.out.println(day + " is a Boring Day.");
			}

		}
	}

}
