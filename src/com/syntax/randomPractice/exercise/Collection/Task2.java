package com.syntax.randomPractice.exercise.Collection;

import java.util.LinkedList;

public class Task2 {
   /* Create a Card class that will have implemented
      and unimplemented methods and a constructor
      that  will  initialize  credit  card  type. Create 3
      subclasses  of  a  card.  Create  3  objects  of
      different  card  and  store  them  into  LinkedList.
      Using  for  loop/advanced  for  loop/  iterator
      access all methods of the class.*/

   public static void main(String[] args) {
       Card boaUser=new BOA("Premium Rewards credit card");
       Card discoverUser = new Discover("Student Cash Back credit card");
       Card chaseUser = new Chase("Chase Freedom Unlimited®");

       LinkedList<Card> cards = new LinkedList<>();
       cards.add(boaUser);
       cards.add(discoverUser);
       cards.add(chaseUser);
       for(Card card:cards){
           card.getCredit(50000,45000);
       }
   }
}
abstract class Card{
    String CreditCardType;
    Card(String CreditCardType){
        this.CreditCardType=CreditCardType;
    }
    void cardInfo(){
        System.out.println("some Info");
    }
    abstract void getCredit(double annualSal,double minimumSalReq);
}
class BOA extends Card{

    BOA(String CreditCardType) {
        super(CreditCardType);
    }

    @Override
    void getCredit(double annualSal,double minimumSalReq) {
        if(annualSal>minimumSalReq){
            System.out.println("You are qualified for the "+CreditCardType);
        }
    }
}
class Discover extends Card{

    Discover(String CreditCardType) {
        super(CreditCardType);
    }

    @Override
    void getCredit(double annualSal, double minimumSalReq) {
        if(annualSal>minimumSalReq){
            System.out.println("You are qualified for the "+CreditCardType);
        }
    }
}
class Chase extends Card{
    Chase(String CreditCardType) {
        super(CreditCardType);
    }
    @Override
    void getCredit(double annualSal, double minimumSalReq) {
        if(annualSal>minimumSalReq){
            System.out.println("You are qualified for the "+CreditCardType);
        }
    }
}
