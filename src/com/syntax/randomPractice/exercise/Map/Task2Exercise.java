package com.syntax.randomPractice.exercise.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2Exercise {
    /*
    Create a Person class with following private fields: name,lastName,age,salary.
    Variables should be initialized through constructor. Inside the class also create a method print user details.
    In Test class crease Map that will store key in ascending order.
    In that map store personId and Person object. print each object detail.
     */
    public static void main(String[] args) {
        Person person1 = new Person("Harry","Sharma",23,110000);
        Person person2 = new Person("Omar","Khan",22,180000);
        Person person3 = new Person("Sefali","Patel",53,170000);
        Person person4 = new Person("Suraksha","Pant",63,120000);
        Person person5 = new Person("Nelson","Mandela",27,130000);
        Map<Integer,Person>info = new TreeMap<>();
        info.put(3,person1);
        info.put(2,person2);
        info.put(1,person3);
        info.put(5,person4);
        info.put(4,person5);
        System.out.println(info);
        System.out.println();
        Set<Map.Entry<Integer, Person>> allInfo = info.entrySet();
        var iterator = allInfo.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Person>next = iterator.next();
            var individual = iterator.next();
            System.out.println(individual.getKey()+" -> "+individual.getValue());
            individual.getValue().userDetail();
            System.out.println();
        }
    }
}
class Person{
    private String fName;
    private String lName;
    private int age;
    public int salary;

    public Person(){}
    public Person(String fName, String lName, int age, int salary) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    void userDetail(){
      System.out.println("First Name: "+fName+", Last Name: "+lName+", Age: "+age+", Salary: "+salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + getfName() + '\'' +
                ", lName='" + getlName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }
}
