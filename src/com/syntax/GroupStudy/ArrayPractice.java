package com.syntax.GroupStudy;

public class ArrayPractice {
    static int sumRow(int[][] number) {
        int sum = 0;
        int sum1=0;
        for (int i = 0; i < number.length; i++) {
            // sum=0;
            for (int j = 0; j < number[i].length; j++) {
                sum += number[i][j];
            }
            sum1=sum;
        }
        return sum1;
    }


    public static void main(String[] args) {
        int[][] numbers = {
                {2, 6, 4},
                {767, 86, 43},
                {4, 7, 8}//
        };
        System.out.println(sumRow(numbers));


    }
}

