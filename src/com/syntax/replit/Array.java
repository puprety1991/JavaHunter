package com.syntax.replit;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] number = new int[5];
		    
		    for(int i=0; i<number.length; i++){
		      number[i] = input.nextInt();
		    }
		      for(int j=number.length-1; j>-1;j--){
		        System.out.println(number[j]);
		      }
		     
	}

}
