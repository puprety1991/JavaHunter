package com.syntax.class09;

public class HW1 {
	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */
		String[] cars = new String[6];
		cars[0] = "Ford";
		cars[1] = "Ferrari";
		cars[2] = "Honda";
		cars[3] = "Toyota";
		cars[4] = "Kia";
		cars[5] = "Suzuki";
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("-------------");

		String[] car = { "Ford", "Ferrari", "Honda", "Toyota", "Kia", "Suzuki" };
		for (String carList : car) {
			System.out.print(carList+" ");
		}

	}

}
