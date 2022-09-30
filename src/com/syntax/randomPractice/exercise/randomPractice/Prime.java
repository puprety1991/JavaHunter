package com.syntax.randomPractice.exercise.randomPractice;

public class Prime {
	public static void main(String[] args) {
		int number=43; 
        boolean prime=false;

        if(number>1) {
        	
        for (int i=2; i<number; i++) {
            if (number%i==0) {
                prime=true;
                break;
            }
        } 
	  }else {
		  prime = true;
	  }

        if (!prime) {
            System.out.println(number+" is a prime number");
        } else {
            System.out.println(number+" is not a prime number");

        }


        }

    
	}


