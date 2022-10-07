package com.syntax.review.class07;

public class bankAccount {

    private String userName;
    private String password;
    private int balance;
    private String accountType;
    private int sendMoney;


    public bankAccount(int cusBalance, String cusAccountType, int cusSendMoney){
        this.balance = cusBalance;
        this.accountType = cusAccountType;
        this.sendMoney = cusSendMoney;

    }

    public bankAccount(String cusUserName, String cusPassWord){
        this.userName = cusUserName;
        this.password = cusPassWord;
    }

    boolean login(String confirmedPassword){
        if(password.equals(confirmedPassword)){
            return true;
        }else{
            return false;
        }
    }
    public void transferMoney(String nextAccountType){
        String output = "";

        if(!accountType.equalsIgnoreCase(nextAccountType)){
            if(balance>sendMoney){
                int remain = balance-sendMoney;
                output = "You have successfully Transferred. Your remaining balance is "+remain;
            }else{
                output = "You do not have enough balance to transfer.";
            }

        }else{
            output = "Account Type needs to be different.";
        }
        System.out.println(output);
    }


}
