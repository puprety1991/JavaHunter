package com.syntax.GroupStudy;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = scan.nextInt();
        double d = scan.nextDouble();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
