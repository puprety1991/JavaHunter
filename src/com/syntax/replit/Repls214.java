package com.syntax.replit;

class SyntaxStudentException extends Exception {
    public SyntaxStudentException (String str){
        super(str);
    }
}
public class Repls214 {
    /*Create a custom Exception class
    In main class create a method that will check students grade
    if students grade is >90 then below exception should be thrown
    if students grade is below 90 print "You are a great student"
    In main method calls method gradeCheck and handle an Exception
        **Expected Output:**
    SyntaxStudentException: You are an exceptionally awesome student*/

    public static String checkGrade(int sub1,int sub2, int sub3) throws SyntaxStudentException {
        int grade=(sub1+sub2+sub3)/3;
        if(grade>90){
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        }
        if(grade<90){
            return "You are a great student";
        }
        return "";
    }
    public static void main(String[] args){
        try{
            System.out.println(checkGrade(96,98,98));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


