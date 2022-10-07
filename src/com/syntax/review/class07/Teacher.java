package com.syntax.review.class07;

public class Teacher {
    String fName, lastName;
    int experience;
    double salary;
    static String schoolName = "Little Flower";

   public Teacher(String teacherName,String teacherLastName,int teacherExp, double teachSal){
       fName=teacherName;
       lastName = teacherLastName;
       experience = teacherExp;
       salary = teachSal;
    }
    public String info(){
       return fName+" "+lastName;
    }
    public String getPromotion(){
       if(experience>=5){
           return "You are Promoted";
       }else{
           return "You do not have enough experience";
       }
    }
    public String buyHouse(double baseSalary){
       if(salary>=baseSalary){
           return "You can afford the house";
       }else{
           return "You salary is not enough to buy House";
       }
    }
}
