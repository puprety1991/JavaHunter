package com.syntax.Lambda.practice;

public interface Account {
    void getUserName();
}
class UserAccount{
   public static void userName(Account name){
       name.getUserName();
    }

    public static void main(String[] args) {
       Account user = ()-> System.out.println("syntax123");
       userName(user);
    }
}

