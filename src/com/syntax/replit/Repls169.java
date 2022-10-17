package com.syntax.replit;

public class Repls169 {
    /*
    Create final method avgElements that will average all
    the elements in an integer array (passed to the method as a parameter) and return the average.
     */
    static final double avgElements(int[] nums){
        double sum=0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        return sum/len;
    }
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}
