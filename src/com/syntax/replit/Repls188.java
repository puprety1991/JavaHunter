package com.syntax.replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Repls188 {
/*    Using Scanner class add 5 elements into ArrayList and
    then print all elements from that ArrayList all in 1 line */
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ArrayList<Integer> number=new ArrayList<>();
    for(int i=0;i<5;i++){
        number.add(input.nextInt());
    }
    for(int i=0;i<number.size();i++){
        System.out.print(number.get(i)+" ");
    }
}
}
