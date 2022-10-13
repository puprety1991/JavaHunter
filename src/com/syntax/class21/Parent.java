package com.syntax.class21;

public class Parent {
    void getMarry(){
        System.out.println("You will marry the girl that we will select for you.");
    }
}
class Robin extends Parent{
    void getMarry(){
        System.out.println("I will marry whom i loved.");
    }
}
class TesterParent{
    public static void main(String[] args) {
        Robin obj = new Robin();
        obj.getMarry();
    }
}
