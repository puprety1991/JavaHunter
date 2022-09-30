package com.syntax.replit;

import java.util.Scanner;

public class LogicalOperator02 {
	public static void main(String[] args) {
		/*
		 * Prompt user with a question: "Is it weekend?"
           If it is not a weekend --> subject="manual testing"
           Otherwise --> subject="Java"
		 */
		Scanner input = new Scanner(System.in);
	    System.out.println("Is it weekend?");
	    boolean answer = input.nextBoolean();
	    String time = "null";
	    if(!answer){
	      time = "manual testing";
	    }else{
	      time = "Java";
	    }
	    System.out.println("Today you will be learning "+time);
	}

}
