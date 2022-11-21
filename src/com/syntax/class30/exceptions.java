package com.syntax.class30;

public class exceptions {
    public static void main(String[] args){

        try{
            path();
            // System.out.println(path("32323"));
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static void path(){
        System.out.println(System.getProperty("user.dir"+""));

    }


}
