package com.syntax.replit.Interview;

public class Repls220s {
    public static void main(String[] args) {
        String numbers="00-44  #$% 48 55";
        System.out.println(formatString(numbers.replaceAll("[^0-9]","")));

    }
    public static String formatString(String S){
        String result="";
        for(int i=0;i<S.length();i++){
            result+=S.charAt(i);
            if(i==2&&i==5&&i==8&&i!=S.length()-1){
                result+='-';
            }
        }
        return result;
    }
}
