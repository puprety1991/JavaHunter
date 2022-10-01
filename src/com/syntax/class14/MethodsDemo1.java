package com.syntax.class14;

public class MethodsDemo1 {
    void printManyTimes(String word, int times){
        for(int i=0; i<times; i++){
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        MethodsDemo1 newTimes = new MethodsDemo1();
        newTimes.printManyTimes("life is beautiful",4);
    }
}
