package com.syntax.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Robin","Sharma",32));
        people.add(new Person("Omar","Khalid",42));
        people.add(new Person("James","Blunt",45));
        people.add(new Person("Sarah","Johnson",43));
        people.add(new Person("Harry","Khan",23));
        //Step1: Sort list by last name
        //Step2: Create a method that prints all elements in the list
        //Step3: Create a method that prints all people that has last name beginning with K.


    }
}
class Person{
    private String fName;
    private String lName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }
}
