package com.syntax.class17;

public class Task2 {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
    NOTE: please use different names for instance and local variables.
     */
    private String name;
    private double mathGrade;
    private double scienceGrade;
    private double computerGrade;


   public Task2(String stuName,double stuMathGrade,double stuScienceGrade, double stuComputerGrade){
        name = stuName;
        mathGrade = stuMathGrade;
        scienceGrade = stuScienceGrade;
        computerGrade = stuComputerGrade;
    }
    public void calculateAvg(){
        double avg = (mathGrade+scienceGrade+computerGrade)/3;
        System.out.println(name+"'s Average Grade is "+avg);
    }
}
