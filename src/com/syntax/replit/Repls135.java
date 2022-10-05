package com.syntax.replit;

public class Repls135 {
    /*
    Return a new String built from s that has every instance of the search term surrounded by parentheses
     */
    static String surround(String s, String searchTerm){
        String reserve = s.replaceAll(searchTerm,"("+searchTerm+")");
        //janel.replaceAll(a,"("a")")
        return reserve;
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
        System.out.println(surround("janel","a"));
    }
}
//janel --j(a)nel