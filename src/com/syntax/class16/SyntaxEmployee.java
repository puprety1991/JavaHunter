package com.syntax.class16;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
    create three variable empID, salary and set the CEO to "Sumair"
    Create two object of the class SyntaxEmployee
    set the value of eID, salary for each of objects.
    print out the eID, salay and CEO each of the objects
     */
    int empID;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp = new SyntaxEmployee();
        emp.empID = 111;
        emp.salary = 100000;
        System.out.println("Employee id  "+emp.empID+" has "+emp.salary+" salary. The CEO of company is "+CEO+".");

        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp1.empID = 112;
        emp1.salary = 90000;
        System.out.println("Employee id  "+emp1.empID+" has "+emp1.salary+" salary. The CEO of company is "+CEO+".");
    }

}
