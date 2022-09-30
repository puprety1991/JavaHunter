package com.syntax.class11;

public class Student {

    String fname;
    String lname;
    int id;
    String address;
    char gender;
    String result =null;

    void grade(int mathScore, int englishScore, int computerScore){
        double avg = (mathScore+englishScore+computerScore)/3;
        if(avg>=90 && avg<=100){
            result = "Your Grade is A";
        }else if(avg>=80 && avg<90){
            result = "Your Grade is B";
        }else if(avg>=70 && avg<80){
            result = "Your Grade is C";
        }else if (avg>=0 && avg<70){
            result ="<<>>You have failed<<>>";
        }else{
            result = "Please Enter Valid Score!!";
        }
        System.out.println(result);
    }

    void study(){
        System.out.println("Student is studying");
    }
    void deleteMethod(){
        System.out.println("Deleting message from discord");
    }
    void eat(){
        System.out.println("Eating Pizaaaa......");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.id =123;
        student.address = "6630 Columbia St.";
        student.fname = "Hannah";
        student.lname = "Biden";
        student.gender = 'F';

        System.out.println("Student name: "+student.fname.toUpperCase());
        System.out.println("Student address: "+student.address.toUpperCase());

        student.deleteMethod();
        student.study();
        student.grade(90,87,95);
        System.out.println("---------------------");
        Student student1 = new Student();
        student1.address = "323 Washington St.";


        student1.grade(98,94,67);
        student1.study();
        System.out.println(student1.address);
    }
}
