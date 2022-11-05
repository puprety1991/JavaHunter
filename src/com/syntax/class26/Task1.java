package com.syntax.class26;


import java.util.ArrayList;

public class Task1 {
    /*  Create  a  class  Insurance  that  will  have  an
      attribute as insuranceName and unimplemented
      behaviour  as  getQuote  and  cancelInsurance.
      Create 3 subclasses Car, Pet, Health. Car class has
      it’s own attribute as carModel and Class Pet has
      petType  attribute.  Create  3  objects  of  the  sub
      classes  and  store  them  in  ArrayList.  Using  for
      loop/advanced  for  loop/  iterator  access  all
      methods of the class.*/
    public static void main(String[] args) {
        Insurance carInsurance = new Car("Liberty","honda civic");
        Insurance petInsurance = new Pet("ManyPets","Dog");
        Insurance healthInsurance = new Health("kaiser permanente");

        ArrayList<Insurance> insuranceArrayList =new ArrayList<>();
        insuranceArrayList.add(carInsurance);
        insuranceArrayList.add(petInsurance);
        insuranceArrayList.add(healthInsurance);

        for(Insurance insurance:insuranceArrayList){
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println("Insurance Name: "+insurance.insuranceName);
            System.out.println();
        }
    }
}
 abstract class Insurance{
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract  void cancelInsurance();
}
class Car extends Insurance {
    String carModel;

    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" will give $100 payment for "+carModel+" every month. Deductible will be $500");
    }

    @Override
    void cancelInsurance() {
        System.out.println("We are not satisfied with "+insuranceName);

    }
}
class Pet extends Insurance {
    String petType;

    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+ " will give $35 if you choose premium service "+petType+".");
    }

    @Override
    void cancelInsurance() {
        System.out.println("We are canceling insurance if we are not getting right price for premium.");
    }
}
class Health extends Insurance {

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("We are getting silver insurance.");
    }

    @Override
    void cancelInsurance() {
        System.out.println("We are cancelling insurance.");
    }
}


