package com.syntax.class17;

public class Task3 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class:
     1 - inside same class; 2 - from outside the class; 3 - from different class inside
      different package  and observe result.
     */
    String fName;
    String lName;
    String userName;
    String passWord;
    double balance;
    boolean transferMoney;
    double sendMoney;
    boolean checkBalance;
    static String confirmedPass="pass123";
    boolean isCreditCard;

    private Task3(String accountUserName, String accountPassword,double accountBalance){
        userName = accountUserName;
        passWord = accountPassword;
        balance = accountBalance;
    }
    public Task3(String accountHolderName, String accountHolderLastName){
        fName = accountHolderName;
        lName = accountHolderLastName;
    }
     Task3(boolean creditCard){
        isCreditCard = creditCard;

    }
    protected Task3(boolean accountCheckBalance,double accountBalance,boolean accountTransferMoney, double accountSendMoney){
        checkBalance = accountCheckBalance;
        balance = accountBalance;
        transferMoney = accountTransferMoney;
        sendMoney = accountSendMoney;
    }
    public void info(){
        System.out.println(fName+" "+lName);

    }
    public void login(){
        System.out.println("Username: "+userName);
        System.out.println("Username: "+passWord);
    }
    public void decision(){
        if(isCreditCard){
            System.out.println("You can go for shopping");
        }else{
            System.out.println("Apply for Credit Card");
        }
    }

    public static void main(String[] args) {
        Task3 account = new Task3("syntax","pass123",5000);
        account.login();
    }

}
