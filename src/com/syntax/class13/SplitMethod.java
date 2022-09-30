package com.syntax.class13;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "Batch 14 is really good";
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        String str2 = "Today is Sunday. Sunday is good. Java is also good";
        String[] arr2 = str2.split("[.]");
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[0]);
        String[] arr3 = str.split("[s]");
        for(int i=0; i<arr3.length;i++){
            System.out.print(arr3[i].length());
        }
    }
}