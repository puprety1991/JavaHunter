package com.syntax.class18;

public class ThisKeyWordDemo {
    String str = "Red";
    void print(){
        String str = "Blue";
        System.out.println(str);
        System.out.println(this.str);
    }

    public static void main(String[] args) {
        ThisKeyWordDemo obj = new ThisKeyWordDemo();
        obj.print(); //First output will be 'Blue' because priority will be local variable.
                    //Second output will be instance variable assign value "Red".

    }
}
