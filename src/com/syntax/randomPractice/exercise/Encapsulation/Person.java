package com.syntax.randomPractice.exercise.Encapsulation;

public class Person {
    private String name;
    private String ssn;
    private int age;
    private double taxPaid;
    Person(String name,String ssn,int age,double taxPaid){
        this.name=name;
        this.ssn = ssn;
        this.age=age;
        this.taxPaid=taxPaid;
    }
    public void setTaxPaid(String ssn,double taxPaid){
        if(this.ssn.equals(ssn)){
            if(taxPaid>0){
                this.taxPaid=taxPaid;
             //   System.out.println(this.taxPaid);
            }else{
                System.out.println("Cannot be negative.");
            }

        }else{
            System.out.println("Wrong SSN");
        }
    }
    double getTaxPaid(String ssn){
        if(this.ssn.equals(ssn)){
            return taxPaid;
        }else{
            return -1;
        }
    }

}
class PersonTester{
    public static void main(String[] args) {
        Person david = new Person("David","123-34-5456",25,5000);
        Person mike = new Person("Mike","123-54-5456",35,1000);
       /* System.out.println(david.taxpPad);
        david.taxPaid=0;//Compile Error cannot access and modify data
        System.out.println(david.taxpPaid);*/
        david.setTaxPaid("123-34-556",-1);
        david.setTaxPaid("123-34-5456",-4);
       // System.out.println(david.getTaxPaid("123-34-5456"));

        System.out.println(mike.getTaxPaid("23-54-5456"));
    }
}
