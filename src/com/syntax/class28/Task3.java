package com.syntax.class28;

import java.util.Map;
import java.util.TreeMap;

/*
        Create a Person class with following private fields: name, lastName, age, salary.
        Variables should be initialized through constructor.
        Inside the class also create a method to print user details.
        In Test Class create a Map that will store key in ascending order.
        In that map store personId and a Person Object. Print each object details.
        */
public class Task3 {
            public static void main(String[] args) {
                Person person1 = new Person("Oscar","Pathak",44,106000);
                Person person2 = new Person("Sarah","Khan",34,56000);
                Person person3 = new Person("Jonny","Kharel",24,160000);
                Person person4 = new Person("Johnson","Adhikari",55,102000);
                Person person5 = new Person("Harry","Patel",31,96000);
                Map<Integer,Person>personInfo=new TreeMap<>();
                personInfo.put(4,person5);
                personInfo.put(2,person2);
                personInfo.put(1,person1);
                personInfo.put(3,person3);
                personInfo.put(5,person4);
                System.out.println(personInfo);
            }


}
class Person{
    private String fname;
    private String lname;
    private int age;
    private int salary;

    public Person(String fname, String lname, int age, int salary) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.salary = salary;
    }
    void getDetails(){
        System.out.println("First Name: "+fname+", Last Name: "+lname+", Age: "+age+", Salary: "+salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
