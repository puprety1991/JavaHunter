package com.syntax.randomPractice.exercise.practice;

public class ArrayTask {
	/*
	 * Create an array of chars and store grades into it. A,B,C,D,E,F. Then print a grade B.
	 */
	public static void main(String[] args) {
		char[] grades = {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		/*
		 * Create an array of names and store all names
		 * of your group. Then print your name from that array.
		 */
		String[] names = {"prakriti", "deepa","puskar","adrian"};
		System.out.println(names[2]);
		/*
		 * Create an array of word:Java, Saturday, day, coding, is.
		 * Print the following sentence using elements of array:
		 * "Satuarday is Java coding Day".
		 * 
		 */
		
		String[] sentence = {"Java", "Saturday", "day", "coding", "is"};
		String fSent = sentence[1]+" "+sentence[4]+" "+sentence[0]+" "+sentence[3]+" "+sentence[2];
		System.out.println(fSent);
	
	}

}
