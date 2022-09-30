package com.syntax.randomPractice.exercise.practice;

public class ArrayExercise {
	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6
		 * elements into it. Print all values from the array.
		 */
		String[] cars = {"Toyotoa","BMW","Honda","Ford","Suzuki","Kia"};
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		/*
		 * Create an array on integer and calculate the sum of all elements in an array.
		 */
		int[] numbers = {10, 54, 65, 45, 65, 23, 65, 53};
		int sum = 0;
		for(int j = 0; j<numbers.length;j++) {
			sum+=numbers[j];
			
		}
		System.out.println("--------");
		System.out.println(sum);
		
	}

}
