package com.syntax.Projects.project01;

public class Task8 {

	public static void main(String[] args) {

		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */

		int count = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers: ");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            int number3 = num1 + num2;
            num1 = num2;
            num2 = number3;
        }
        // Write a Java Program to print the first 10 numbers of Fibonacci series
        // 0 1 1 2 3 5 8 13 21
        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for(int i=0; i<8;i++) {
            nextNum=previous+currentNumber;
            System.out.println(nextNum);
            previous=currentNumber;
            currentNumber=nextNum;

        }

    }
    }


