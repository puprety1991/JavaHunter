package com.syntax.class14;

public class PrimeTask {
    /*
     Write a method to return whether given number is prime or not?
     */
    boolean isPrime(int number){
        boolean flag = false;

            for (int i = 2; i <= number/2; i++) {

                if (number % i == 0) {
                    flag = true;
                    break;
                }
            }

        if(number == 1){
            return false;
        }else{
            if (!flag)
                return true;
            else
                return false;
        }

    }

    public static void main(String[] args) {
        PrimeTask toCheck = new PrimeTask();
        if(toCheck.isPrime(9)){
            System.out.println("This is Prime number");
        }else{
            System.out.println("This is not a prime number");
        }
    }
}
