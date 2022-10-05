package com.syntax.class16;

public class Person {
    //public String name="ramesh"; //it will access from different packages.
    //int salary=47774; // it won't access from different packages.
    //private int ssn = 32323;
    //protected  int id = 123;

    private String password= "pass123";
    double salary = 9000;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.password);
        System.out.println(person.salary);
    }
}
