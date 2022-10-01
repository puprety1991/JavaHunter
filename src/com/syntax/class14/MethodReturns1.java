package com.syntax.class14;

public class MethodReturns1 {
    boolean mystery(){
        return false;
    }
    String displayMsg(int number){
        return "Java";
    }
    String method(String word){
        //return "Java";
        //return word;
        if(word.equals("Java")){
            return "Python";
        }else{
            return "Java";
        }
    }

    public static void main(String[] args) {
        MethodReturns1 methodReturns1 = new MethodReturns1();
        System.out.println(methodReturns1.mystery());
        System.out.println(methodReturns1.displayMsg(2));
        System.out.println(methodReturns1.method("Java"));
    }

}
