package com.syntax.GroupStudy;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount user = new BankAccount("syntax", "pass123");
       user.login("pass1233");
       BankAccount user2 = new BankAccount("checking",5000,1000);
       user2.TransferMoney("saving");


        BankAccount user1 = new BankAccount();

    }
}
