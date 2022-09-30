package com.syntax.randomPractice.exercise.practice;

public class ClockNested {
	public static void main(String[] args) {
		String output;

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m <= 59; m++) {

				if (h <= 9 && m <= 9) {
					output = "0" + h + ":" + "0" + m;

				} else if (h >= 10 && m <= 9) {
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
