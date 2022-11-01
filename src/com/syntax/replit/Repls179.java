package com.syntax.replit;

public class Repls179 {
 /*   Create Class EncapsulationDemo that will have 2 variables empName and empAge;
    Create the getter/setter methods for each variable.
    In Main Class and main method
    Using setter methods assign the values as "Mario" and "32"
    Using getter methods print the values as below outputs.
        **Expected Output:**`
         Employee Name: Mario
          Employee Age: 32*/
 public static void main(String[] args){
     EncapsulationDemo emp = new EncapsulationDemo("Mario",32);
     emp.setEmp("Mario");
     emp.setAge(32);
     System.out.println("Employee Name: "+emp.getName());
     System.out.println("Employee Age: "+emp.getAge());
 }
}
class EncapsulationDemo{
    private String empName;
    private int empAge;
    EncapsulationDemo(String empName,int empAge){
        setEmp(empName);
        setAge(empAge);

    }
    public void setEmp(String empName){
        this.empName=empName;
    }
    public void setAge(int empAge){
        this.empAge=empAge;
    }
    public String getName(){
        return empName;
    }
    public int getAge(){
        return empAge;
    }
}
