package com.syntax.project1;

public class Task9 {
	public static void main(String[] args) {

		//Maximum and minimum number in the array?
		
		int[] number = {43,43,20,44,434,656,3,445,32};
		int max = number[0];
		int min = number[0];
		for(int count =1; count<number.length; count++) {
			if(max< number[count]) {
				max = number[count];
			}else if(min> number[count]) {
				min = number[count];
			}
		
		}
		System.out.println("The Maximum Number is "+max);
		System.out.println("The Minimum Number is "+min);
	}

}
