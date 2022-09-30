package com.syntax.randomPractice.exercise.StringMethod;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String username;
        String password;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter username?");
        username = input.nextLine();
        System.out.println("Please Enter the password?");
        password = input.nextLine();
        if(username.isEmpty() || password.isEmpty()){
            System.out.println("Username and Password cannot be empty!");
        }else{
            if(password.length()<8) {
                System.out.println("Password is too short!");
            }
            else{
                if(password.contains(username)){
                    System.out.println("Password should not contain userName!");
                }
                else{
                    if(!password.equalsIgnoreCase("Nepal123")){
                        System.out.println("Password do not match");
                    }
                    else{
                        System.out.println("Your username and password has been created.");
                    }
                }
            }

        }


    }
}
