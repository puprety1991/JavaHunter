package com.syntax.randomPractice.exercise.StringMethod;

public class Task {
    public static void main(String[] args) {
        String userName = "jkdfjkd";
        String password="kfjdkfjhh";
        String confirmPass = "nepal@143";
        int len = password.length();

        if(userName.isEmpty()){
            if(password.isEmpty()){
                System.out.println("Username and Password cannot be empty!");
            }
        }
        else if(len<=8){
            System.out.println("Password is too short.");
        }else if(password.contains(userName)){
            System.out.println("Password contain userName!");
        }else if( !password.equalsIgnoreCase(confirmPass)){
            System.out.println("Password do not match.");
        }else{
            System.out.println("Your username and password has been created.");
        }



    }
}