package com.syntax.replit;

public class Repls159 {
    /*
    Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
    In main method execute all 3 methods to match the output:
     */
    void Sub(int num1, int num2,int num3, int num4){
        int result = (num1-num2-num3-num4);
        System.out.println(result+" (should come from subtracting 4 numbers)");
    }
    void Sub(int num1, int num2,int num3){
        int result = num1-num2-num3;
        System.out.println(result+" (should come from subtracting 3 numbers)");
    }
    void Sub(int num1, int num2){
        int result = num1-num2;
        System.out.println(result+" (should come from subtracting 2 numbers)");
    }
    public static void main(String[] args){
        Repls159 math=new Repls159();
        math.Sub(100,20,20,20);
        math.Sub(100,30,40);
        math.Sub(100,80);
    }
}
