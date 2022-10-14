package com.syntax.review.class08;

import static com.syntax.review.class08.Teacher.work;

public class Teacher {
    String name, lastName;
    String subject;
    int experience;
    double salary;
    static String SchoolName = "George Mason University";

    // this. - use to refers to the current object: instance variables
    // instance method
    Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    // this() - refers to the current object: current class constructor
    Teacher(String name, String lastName, String subject) {
        this(name, lastName);//Constructor call must be the first statement
        this.subject = subject;
    }
    Teacher(String name, String lastName,String subject,int experience) {
        this(name, lastName,subject);
        this.experience=experience;

    }
    static void work(){
        System.out.println("All teachers work at "+SchoolName);
    }
    void info(){
        System.out.println("Teacher name is "+name+" "+lastName);
    }
    void teach(){
        this.info();
        System.out.println(name+" is "+subject+" teacher. Who has "+experience+" years experience.");
    }
}
class TeacherTester{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Prakriti","Uprety");
        Teacher teacher1 = new Teacher("Puskar","Uprety","Java");
        Teacher teacher2 = new Teacher("Harry","Potter","Biology",6);
        teacher2.teach();
        work();


    }
}
