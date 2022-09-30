package com.syntax.class09;

public class ArrayTask {
	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F.
		 *  Then print a grade B (use 2 different ways of creating an array).
		 */
		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[1]);
		
		char[] grades = {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		System.out.println("--------------");
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */
		String[] name = new String[4];
		name[0] = "Prakriti";
		name[1] = "Puskar";
		name[2] = "Puskriti";
		name[3] = "Amaya";
		System.out.println(name[1]);
		
		String[] names = {"Prakriti","Puskar","Puskriti","Amaya"};
		System.out.println(names[1]);
		System.out.println("--------------");
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”
		 */
		String[] sent = new String[5];
		sent[0] = "Java";
		sent[1] = "Satuarday";
		sent[2] = "day";
		sent[3] = "coding";
		sent[4] = "is";
		System.out.println(sent[1]+" "+sent[4]+" "+sent[0]+" "+sent[3]+" "+sent[2]);
		
		String[] sente = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(sente[1]+" "+sente[4]+" "+sente[0]+" "+sente[3]+" "+sente[2]);
		
		
	
		
	}

}
