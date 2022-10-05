package com.syntax.class16;

public class BankAccount {
    private String userName;
    private String passWord;
    int accountNumber;
    public String bankName;

    public void printBankName(){
        System.out.println("My bank is "+bankName);
    }
    private void printUserName(){
        System.out.println("Username: "+userName);
    }
    private void printPassWord(){
        System.out.println("Password: "+passWord);
    }
    void printAccountNum(){
        System.out.println("Bank A/C: "+accountNumber);
    }

    public static void main(String[] args) {

    }

}
