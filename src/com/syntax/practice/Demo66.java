package com.syntax.practice;

public class Demo66 {
    public static void main(String[] args) {
       //Student str =new SyntaxStudent();
        Student [] str1={ new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (int i = 0; i < str1.length; i++) {
            Student student = str1[i];
            student.info();
            student.myInfo();

        }
    }
}

class Student{

    void info(){
        System.out.println("I am a student ");
    }
    void myInfo(){
        System.out.println("I live in VA ");
    }

}
class SyntaxStudent extends Student{
    void info(){
        super.info();
        System.out.println("I am a syntax student");
    }

}
class CollegeStudent extends Student{
    void info(){
        System.out.println("I am a college student ");
    }
}
class SchoolStudent extends Student{
    void info(){

        System.out.println("I am school student");
    }

    void myInfo(){
        super.myInfo();
        System.out.println("I live in New York");
    }
}

