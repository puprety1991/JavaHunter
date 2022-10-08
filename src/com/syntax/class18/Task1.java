package com.syntax.class18;

public class Task1 {
    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */
    private String stuName;
    private String stuAddress;

    public Task1(String stuName, String stuAddress){
        this.stuName = stuName;
        this.stuAddress = stuAddress;
    }
    public void displayInfo(){
        System.out.println("Student Name: "+stuName);
        System.out.println("Student Address: "+stuAddress);
    }

    public static void main(String[] args) {
        new Task1("Donal","7780 lee Highway").displayInfo();
    }
}
