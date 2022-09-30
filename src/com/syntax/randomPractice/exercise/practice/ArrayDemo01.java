package com.syntax.randomPractice.exercise.practice;

public class ArrayDemo01 {
	public static void main(String[] args) {
		String[] names = {"Puskar","Prakriti","Abdul",
				          "Deepa","Prashuv"};
		int[] number = {1,2,3,4,5,6};
		System.out.println(names[3]);
		
		// how do i know many elements i have in the array?
		int size = names.length;
		System.out.println("Size of names array = "+size);
	}

}
