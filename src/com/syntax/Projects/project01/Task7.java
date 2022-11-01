package com.syntax.Projects.project01;

public class Task7 {
	public static void main(String[] args) {

		/*
		 * Write a java program to check whether a given number is prime or not?
		 */

		int num = 1;
		boolean flag = false;
		if(num==1){
			flag=true;

		}else{
			for (int i = 2; i <= num / 2; ++i) {
				// condition for nonprime number
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		  }

	}
