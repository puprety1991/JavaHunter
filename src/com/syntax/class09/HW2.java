package com.syntax.class09;

public class HW2 {
	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it. Using 2 different
		 * loops print all elements from the array.
		 */
		String[] animal = { "dog", "monkey", "zebra", "buffalo", "ox" };
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i]);

		}
		System.out.println("-----------------");
		for (String animalList : animal) {
			System.out.print(animalList+" ");
		}
	}

}
