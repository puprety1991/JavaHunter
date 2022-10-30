package com.syntax.class25;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=10;

        //  Integer wrapperNum = Integer.valueOf(num); / //boxing or manual conversion from primitive to wrapper type
        Integer wrapperNum = num; // AutoBoxing or automatic conversion of a primitive to wrapper type
        System.out.println(wrapperNum);

        int num2=wrapperNum;// Auto-unboxing


    }
}
