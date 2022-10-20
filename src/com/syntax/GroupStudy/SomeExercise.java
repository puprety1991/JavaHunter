package com.syntax.GroupStudy;

public class SomeExercise {
    public static void main(String[] args) {
        int[][] num = {
                {5, 54, 54},
                {3, 4, 3},
                {43, 3, 43}
        };
        int count=0;
        for(int i=0;i<num.length;i++) {
            for (int j = 0; j < num[i].length; j++) {
                int toCheck = num[i][j];
                for(int k=j+1;k<num.length;k++)
                if (num[i][j] == num[i][k]) {
                    System.out.println(num[i][j]);
                    count++;
                }
            }

        }
        System.out.println("There are "+count+" duplicates.");

    }
}