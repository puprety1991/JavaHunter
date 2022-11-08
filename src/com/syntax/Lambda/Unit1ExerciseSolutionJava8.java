package com.syntax.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {
        public static void main(String[] args) {
            List<Person> people = new ArrayList<>();
            people.add(new Person("Robin", "Sharma", 32));
            people.add(new Person("Omar", "Khalid", 42));
            people.add(new Person("James", "Blunt", 45));
            people.add(new Person("Sarah", "Johnson", 43));
            people.add(new Person("Harry", "Khan", 23));

            //Step1: Sort list by last name

            Collections.sort(people, (Person p1, Person p2) -> p1.getlName().compareTo(p2.getlName()));

            //Step2: Create a method that prints all elements in the list

            printConditionally(people,p -> true);

            //Step3: Create a method that prints all people that has last name beginning with K.

            System.out.println();
            printConditionally(people,p -> p.getlName().startsWith("K"));
            System.out.println();
        }

        private static void printConditionally(List<Person> people, Conditions condition) {
            for (Person p : people) {
                if (condition.test(p)) {
                    System.out.println(p);
                }
            }
        }

        private static void printAll(List<Person> people) {
            for (Person p : people) {
                System.out.println(p);
            }
        }
    }

