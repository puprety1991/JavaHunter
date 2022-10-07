package com.syntax.review.class07;

public class bankTester {
    public static void main(String[] args) {
        bankAccount user1 = new bankAccount("syntax","pass123");
       if(user1.login("pass123")){
           System.out.println("You have successfully logged in");
       }else{
           System.out.println("Password does not match");
       }

       bankAccount user1s = new bankAccount(5000,"saving",10000);
       user1s.transferMoney("checking");
    }
}
