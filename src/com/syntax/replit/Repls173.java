package com.syntax.replit;
public class Repls173 {
    /*
    Create a Super Class Tea that will have:
    - instance variable teaType;
    - constructor that will initialize
    - unimplemented method addSugar(),
    Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
    In main class create an object of 2 Child and assign them to Parent reference type.
    Execute method addSugar from both classes.
     */
    public static void main(String[] args){
        Tea[] tea = {new LemonTea("2 spoons"),new Chai("1 spoon")};
        for(Tea chiya:tea){
            chiya.addSugar();
        }
    }
}
    abstract class Tea{
        String teaType;
        Tea(String teaType){
            this.teaType=teaType;
        }
        abstract void addSugar();
    }
    class LemonTea extends Tea{
        LemonTea(String teaType){
            super(teaType);
    }
        void addSugar(){
            System.out.println("For Lemon Tea we need "+teaType+" of sugar");
        }
    }
    class Chai extends Tea{
        Chai(String teaType){
            super(teaType);
        }
        void addSugar(){
            System.out.println("For Chai Tea we need "+teaType+" of sugar");
        }
    }
