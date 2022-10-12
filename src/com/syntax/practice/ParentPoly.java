package com.syntax.practice;

public class ParentPoly {
    void sleep(){
        System.out.println("I like sleep at least 6 hours ");
    }
    void eat(){
        System.out.println("I like to eat MoMo");
    }
}
class Helen extends ParentPoly{

}
class Prakriti extends ParentPoly{
    void sleep(){
        System.out.println("I like sleep at least 7 hours ");
    }
    void eat(){
        System.out.println("I like to eat ChatPate");
    }

}
class Puskar extends ParentPoly{

    void eat(){
        System.out.println("I like to eat Steak & Cheese");
    }
}
class TesterParent{
    public static void main(String[] args) {
       //ParentPoly parentPoly=new Helen();
       //parentPoly=new Prakriti();
       //parentPoly=new Puskar();
       //or
        ParentPoly[] family = new ParentPoly[3];
        family[0]=new Helen();
        family[1]=new Prakriti();
        family[2]=new Puskar();
        for(ParentPoly familyArray:family){
            familyArray.eat();
            familyArray.sleep();
        }
    }

}
