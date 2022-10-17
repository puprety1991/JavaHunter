package com.syntax.class22;

public class Task1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(),new CollageStudent(),new SchoolStudent()};
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            student.info();
            student.getScore();
        }
    }
}
class Student{
    public void info(){
        System.out.println("Students go to school/college/bootcamp");
    }
    public void getScore(){
        System.out.println("Student get grade");
    }

}
class SyntaxStudent extends Student{
    public void info(){
        System.out.println("Student of Syntax");
    }
   public void getScore(){
        System.out.println("Syntax Student get grade");
    }
}
class CollageStudent extends Student{
    public void info(){
        System.out.println("Student of College");
    }
    public void getScore(){
        System.out.println("College Student get grade");
    }
}
class SchoolStudent extends Student{
   public void info(){
        System.out.println("Student of HighSchool");
    }
    public void getScore(){
        System.out.println("High School Student get grade");
    }

}

