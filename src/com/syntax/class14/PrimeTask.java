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
    boolean toCheckPrime(int number){
        boolean flag = true;

        if(number>1){
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    flag = false;
                    break;
                }

        }

        }else {
            flag=false;
        }

       return flag ;
        }



    public static void main(String[] args) {
        PrimeTask toCheck = new PrimeTask();
        if(toCheck.isPrime(9)){
            System.out.println("This is Prime number");
        }else{
            System.out.println("This is not a prime number");
        }
        if(toCheck.toCheckPrime(67)){
            System.out.println("This is Prime number");
        }else{
            System.out.println("This is not a prime number");
        }
    }
}
