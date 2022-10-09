package com.syntax.replit;

public class Repls141{
    /*
    Create the maxValue method that will accept int array and return the maximum value in the array.
    Method should be visible every class in any package!
    **Expected Output:**`
        -->22
     */
        public static int maxValue(int[] num){
            int max=0;
            for(int i=0; i<num.length;i++){
                if(num[i]>max){
                    max=num[i];
                }
            }
            return max;
        }
public static void main(String[] args) {
    int[] arr = {5, 12, -3, 7, 3, 22};
    System.out.println(maxValue(arr)); //should print 22
}
}
