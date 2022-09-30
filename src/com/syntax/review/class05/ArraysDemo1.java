package com.syntax.review.class05;

import java.util.Arrays;

public class ArraysDemo1 {
	public static void main(String[] args) {
		String [] arr = new String[] {"Pink Dress","Cocktail","Summer Dress","Night dress",
				"Pencil Dress"};
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Lets try "+arr[i]);
		}
		System.out.println();
		for(String dress:arr) {
			System.out.println(dress);
			 
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

}
