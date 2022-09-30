package com.syntax.randomPractice.exercise.randomPractice;

import java.util.Scanner;

public class ShoppingComplex {
    Scanner input = new Scanner(System.in);


    int shoesPrice;
    int tShirtPrice;
    int halfpantPrice;
    int walletPrice;
    int slipperPrice;
    int total;
    int payment;
    int difference;
    boolean isCard;
    int creditCardLimit;
    boolean isCash;





    void shopping() {
        total = shoesPrice + tShirtPrice + halfpantPrice + walletPrice + slipperPrice;
        if(isCard) {
            System.out.println("Your total amount is "+total+". Please make a payment with Card!");
            if(creditCardLimit>total) {
                System.out.println("Thank You For Shopping");
            }else {
                System.out.println("You do not have enough balance in your Card!");
            }
        }else if(isCash) {
            System.out.println("Your total amount is "+total+". Pleaee make a payment with Cash.");
            payment = input.nextInt();
            while(total != payment) {
                if(total > payment) {
                    difference = total-payment;
                    System.out.println("Please make $ "+ difference+" more ");
                    break;
                }else if (total<payment) {
                    difference = payment - total;
                    System.out.println("Your change is $"+difference+". Thank you for shopping!");
                    break;
                }


            }
            if(payment == total) {
                System.out.println("Thank you for Shopping!");
            }

        }
    }
}
