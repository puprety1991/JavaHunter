package com.syntax.Lambda;

public class TypeInterfaceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = (s) ->  s.length();
        System.out.println(myLambda.getLength("Hello World"));
        printLambda(x->x.length());
    }
    interface StringLengthLambda{
        int getLength(String s);
    }
    public static void printLambda(StringLengthLambda st){
        System.out.println(st.getLength("Hello Lambda"));
    }
}
