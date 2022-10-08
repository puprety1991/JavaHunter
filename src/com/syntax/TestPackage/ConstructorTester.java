package com.syntax.TestPackage;

import com.syntax.GroupStudy.Constructor;

public class ConstructorTester {
    public static void main(String[] args) {
        Constructor people = new Constructor(25);
        System.out.println(people.ageInfo());
           //OR
        String result = people.ageInfo();
        System.out.println(result);

    }
}
