package com.syntax.replit;

import java.util.Scanner;

public class LogicalOperator01 {
	public static void main(String[] args) {
		/*
		 * Take 2 boolean inputs from a user:
        "Are you thirsty?"
        "Are you sleepy? "
        If user is thirsty and not sleepy--> drink=water
        If user is thirsty and sleepy--> drink=coffee
        If user is not thirsty and sleepy --> drink=tea
        Otherwise drink="nothing"
		 */
	    Scanner input = new Scanner(System.in);
	    System.out.println("Are you thirsty?");
	    boolean isThirst = input.nextBoolean();
	    System.out.println("Are you sleepy?");
	    boolean isSleepy = input.nextBoolean();
	    String advice = "null";

	    if(isThirst && !isSleepy){
	      advice = "water";
	    }else if(isThirst && isSleepy){
	      advice = "coffee";
	    }else  if(!isThirst && isSleepy){
	      advice = "tea";
	    }else{
	      advice = "nothing";
	    }
	    System.out.println("Looks like you need to drink "+advice);
		
	}

}
