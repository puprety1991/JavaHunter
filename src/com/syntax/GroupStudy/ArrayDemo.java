package com.syntax.GroupStudy;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] country={"USA","Japan","Mexico","Canada","South Africa", "Australia"};
        String store="";
        int max=0;
        for(int i=0;i<country.length;i++){
            if(country[i].length()>max){
                max=country[i].length();
                store=country[i];
            }
        }
        System.out.println(store);
    }
}
