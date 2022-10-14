package com.syntax.class21;

public class Task2 {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.calculate(6000);
        Visa visa = new Visa();
        visa.calculate(3000);
        AX ax = new AX();
        ax.calculate(5000);
    }
}
class CreditCard{
    void calculate(double balance){
        if(balance>5000){
            System.out.println("The interest will be: "+balance*(3.5/100));
        }else{
            System.out.println("The interest will be: "+balance*(2.5/100));
        }
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    void calculate(double balance){
        if(balance>5000){
            System.out.println("The interest will be: "+balance*(4.5/100));
        }else{
            System.out.println("The interest will be: "+balance*(3.5/100));
        }
    }
}
