package com.syntax.review.class10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Student>students=new HashSet<>(); //UpCasting
        /*
        If we don't override equals method in our custom classes most of the collections framework will
        not work properly those classes
         */
        students.add(new Student("Krish","Patel","121"));
        students.add(new Student("Krishna","Sharma","131"));
        students.add(new Student("Omar","Khan","141"));
        students.add(new Student("Harry","Khanal","151"));
        System.out.println(students);
        ArrayList<Student>students1=new ArrayList<>(students);
        System.out.println(students1.get(0));

    }
}
