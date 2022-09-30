package com.syntax.class13;

public class StringBulider {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Java");
        System.out.println(str);
        str.append(" Tutorials");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(0,5);
        System.out.println(str);
        str.insert(0,"Java ");
        System.out.println(str);

    }
}
