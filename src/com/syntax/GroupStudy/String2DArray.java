package com.syntax.GroupStudy;

public class String2DArray {
    public static void main(String[] args) {
        String[][] countries = {
                {"Usa", "Canada"},
                {"Peru", "Ecuador", "Panama"},
                {"Egypt", "lybia", "Tunisia", "Morroco"},
                {"Thailand", "India", "Pakistan", "China"}
        };
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");

            }
            System.out.println();

        }
    }
}
