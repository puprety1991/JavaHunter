package com.syntax.class14;

import java.util.Scanner;

public class largestNumberTask {
    /*
    Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */
    int max(int num1, int num2){
        int largest;
        if(num1>num2){
            largest = num1;
        }else{
            largest = num2;
        }
        return largest;
    }
                    //OR
    void printLarger(int n1, int n2){
        if(n1>n2){
            System.out.println(n1+" is larger than "+n2);
        }else{
            System.out.println(n2+" is larger than "+n1);
        }
    }
    public static void main(String[] args) {
        largestNumberTask findMax = new largestNumberTask();
        System.out.println("The largest number is "+findMax.max(7,6));
                    //another way
        String max = "The largest number is "+findMax.max(5,8);
        System.out.println(max);

                    //using void
        largestNumberTask findLarg = new largestNumberTask();
        findLarg.printLarger(78,43);

                    //Using Scanner
        Scanner numbers = new Scanner(System.in);

        System.out.println("Please enter two numbers");
        int numb1 = numbers.nextInt();
        int numb2 = numbers.nextInt();

        largestNumberTask findbig = new largestNumberTask();
        System.out.println("The largest number is "+findbig.max(numb1,numb2));
        findbig.printLarger(numb1,numb2);
    }
}
