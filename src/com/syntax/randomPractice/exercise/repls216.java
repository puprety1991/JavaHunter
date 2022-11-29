package com.syntax.randomPractice.exercise;
import java.util.Arrays;
public class repls216 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(3)));
    }
    public static int[] arraySumToZero(int N) {
        int[] array = new int[N];
        for (int i = 0; i < N; i += 2) {
            array[i] = N / 2 + i / 2;
            if (i < (N - 1))
                array[i + 1] = -(N / 2 + i / 2);
            else
                array[i] = 0;
        }
        return array;
    }
}
