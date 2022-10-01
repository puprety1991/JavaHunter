package com.syntax.class14;

public class Math {
    void printFiboSeries(int size){
        System.out.println("Fibonacci series of "+size);

        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println("previous number: "+previous);
        System.out.println("current number: "+currentNumber);
        for(int i=0; i<size;i++) {
            nextNum=previous+currentNumber;
            System.out.print(nextNum+" ");
            previous=currentNumber;
            currentNumber=nextNum;
        }
        System.out.println();
        System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");

    }

    public static void main(String[] args) {
        Math obj=new Math(); // Creating an object of the Math class
        obj.printFiboSeries(5);
        obj.printFiboSeries(10);
    }
}
