package com.syntax.class11;

public class Employee {
    int empId;
    String name;
    String department;
    double salary;
    String shift;

    void work(){
        System.out.println(name+" is working on "+shift+" shift.");
    }
    void takeLeaves(){
        if(department.equalsIgnoreCase("HR")){
            System.out.println(name+ " is going on leave.");
        }else{
            System.out.println(name+ " is not going on leave");
        }
    }
    void makeMoney(int money){
        if(shift.equalsIgnoreCase("day")){
            System.out.println("You are making $"+money+" per month.");
        }
    }


    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empId = 123;
        emp.name= "John";
        emp.shift = "Day";
        emp.salary = 200000;
        emp.department = "Hr";

        emp.work();
        emp.takeLeaves();
        emp.makeMoney(4000);

        System.out.println("-----------------");
        Employee emp1 = new Employee();
        emp1.empId =321;
        emp1.name="Sarah";
        emp1.department = "IT";
        emp1.shift ="Evening";
        emp1.salary= 90000;

        emp1.work();
        emp1.takeLeaves();
        emp1.makeMoney(5200);
    }

}
