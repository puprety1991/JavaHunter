package com.syntax.Projects.project02;

public class gettingInfo {
    public static void main(String[] args) {
        OopAccount prakriti = new OopAccount();
        prakriti.userName ="puskrity";
        prakriti.passWord = "nepal123";
        prakriti.accountType = "checking";
        prakriti.balance = 5000;
        prakriti.sendMony = 1000;

        prakriti.login("nepal123");
        prakriti.transferBalance("checking");

    }


}
