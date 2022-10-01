package com.syntax.class14;

public class largestNumberTask {
    /*
    Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */
    int max(int num1, int num2){
        int largest;
        if(num1>num2){
            largest = num1;
        }else{
            largest = num2;
        }
        return largest;
    }

    public static void main(String[] args) {
        largestNumberTask findMax = new largestNumberTask();
        System.out.println("The largest number is "+findMax.max(7,6));
                    //OR
        String max = "The largest number is "+findMax.max(5,8);
        System.out.println(max);
    }
}
