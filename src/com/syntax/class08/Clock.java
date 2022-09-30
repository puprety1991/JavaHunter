package com.syntax.class08;

public class Clock {
	public static void main(String[] args) {
		/*
		 * Create a digital clock using nested loops
		 * 
		 * If you can, try to have a clock that would show 2 digits for hour and 2
		 * digits for minutes
		 */
		String output;

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m <= 59; m++) {

				if (h <= 9 && m <= 9) {
					output = "0" + h + ":" + "0" + m;

				} else if (h <= 23 && m <= 9) {
					output = h + ":" + "0" + m;

				} else if (h <= 9 && m >= 10) {
					output = "0" + h + ":" + m;

				} else {
					output = h + ":" + m;
				}
				System.out.println(output);

			}
		}
	}

}
