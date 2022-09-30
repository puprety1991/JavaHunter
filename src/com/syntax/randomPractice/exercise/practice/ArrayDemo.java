package com.syntax.randomPractice.exercise.practice;

public class ArrayDemo {
	public static void main(String[] args) {
		// I have 5 students in the class and i need to calculate the average score.
		
		int[] grades = new int[5];
		grades[0]= 98;
		grades[1]= 58;
		grades[2]= 78;
		grades[3]= 68;
		grades[4]= 88;
		
		int average = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		
		System.out.println("Averagae score of my students = "+average);
		
		double[] array;
		array = new double[3];
		array[0] = 32.43;
		array[1] =22.44;
		array[2] = 11.44;
		
		System.out.println(array[1]);
		
		String[] liquid = new String[4];
		liquid[0]="Water";
		liquid[1]="Tea";
		System.out.println(liquid[1]);
		
		
		
		
	}

}
