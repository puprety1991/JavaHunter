package com.syntax.review.class10;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String rollNumber;

    public Student(String firstName, String lastName, String rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
    }
    void printFullName(){
        System.out.println(firstName+" "+lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
        // if we don't override this method java by default checks the
    // address only to figure out if two objects are same or not
    // type eq and select second option
   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, rollNumber);
    }
}
class ListDemoWithCustomClass{
    public static void main(String[] args) {
        Student stu1=new Student("Prakriti","Pathak","1");
        Student stu2=new Student("Puskar","Uprety","2");
        Student stu3=new Student("Puskrity","Sharma","3");
        ArrayList<Student>students=new ArrayList<>();

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        System.out.println(students);
        for(Student student:students){
            student.printFullName();
        }
        Student stu4 = new Student("Prakriti","Pathak","1");
        System.out.println(students.contains(stu4));
    }
}
