package com.syntax.randomPractice.exercise.StringMethod;

public class SubString {
    public static void main(String[] args) {
        String name = "Ranjan nischal";
        //System.out.println(name.substring(6)); // first 6 characters will be ignored.
                                                         // wille be: nischal(ranjan and one space  will be ignored
        String names = "Can you write the second p too ?";
        System.out.println(names.substring(5,13)); // second 10 will be ignored after index 13 letters.# ou write
        System.out.println(names.substring(8,13)+" "+names.substring(18,24));
    }
}
