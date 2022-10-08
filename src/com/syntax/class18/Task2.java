package com.syntax.class18;

public class Task2 {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */
    private String bookName;
    private String author;
    private int yearRelease;

    public Task2(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
        System.out.println(("Book Name: "+bookName));
        System.out.println("Author: "+author);
    }
    public Task2(int yearRelease){
        this.yearRelease = yearRelease;
        System.out.println("Year of Release: "+yearRelease);
    }

    public static void main(String[] args) {
        Task2 obj = new Task2("Harry Potter","J.K Rowling");
        Task2 obj1 = new Task2(1997);
    }
}
