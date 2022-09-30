package com.syntax.project1;

public class Task10 {
	public static void main(String[] args) {

	//	Write a java program to find the second largest number in the array
		int temp, size;
	      int array[] = {1000, 20, 25, 63,700, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("The Second Largest Number is: "+array[size-2]);
		
		
	}

}
