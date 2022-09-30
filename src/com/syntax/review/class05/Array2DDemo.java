package com.syntax.review.class05;

public class Array2DDemo {
	public static void main(String[] args) {
		
		String[] individuals = new String[] {"Prakriti","Puskar","Puskrity"};
		String[] individuals1 = new String[] {"Puskrity","Prakriti","Puskar"};
		String[] individuals2 = new String[] {"Puskar","Puskrity","Prakriti"};
		// an 2D array that will store 3 single D arrays
		String[][] room = new String[3][];
		
		
		room[0] = individuals;
		room[1] = individuals1;
		room[2] = individuals2;
		
		System.out.println(room[1][1]);
		System.out.println(room[0][2]);
	}

}
