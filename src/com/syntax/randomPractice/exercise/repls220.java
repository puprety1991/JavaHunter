package com.syntax.randomPractice.exercise;

public class repls220 {
    public static String formatString(String S) {
        String dash="-";
        String s2=S.replaceAll("[^0-9]","");
        StringBuilder sb=new StringBuilder(s2);
        int length = s2.length();
        int j=1;
        for(int i=3; i<length; i+=3){
            if(i ==3){
                sb.insert((i), dash);
            }else{
                sb.insert((i+j), dash);
                j++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(formatString("00-44   48 55555"));
    }
}
