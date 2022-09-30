package com.syntax.review.class05;

import java.util.Arrays;

public class ArrayDemo1 {
	public static void main(String[] args) {
		// creates an array store element in the array
		//then with help of another array adds all the elements.
		int size = 10;
		int start =11;
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] =start;
			start++;
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int n :arr) {
			sum+=n;
			
		}
		System.out.println(sum);
	}

}
