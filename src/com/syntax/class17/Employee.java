package com.syntax.class17;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private String id;
    private int age;
    double actualSalary;
    static String companyName="Syntax";

    Employee(String empName, String empDepart, double empSalary, String empId, int empAge){
        name = empName;
        department = empDepart;
        salary= empSalary;
        id = empId;
        age = empAge;

    }

    void printSalary(){
        actualSalary = salary+20000+10000;
        System.out.println(actualSalary);
    }
    void calculatePrintTax(){
        double tax = actualSalary*0.3;
        System.out.println("Tax "+tax);
    }

   // public static void main(String[] args) {
     //   Employee emp1 = new Employee("Jason","IT",70000,"121",24);
       // emp1.printSalary();
        //emp1.calculatePrintTax();
    //}
}
