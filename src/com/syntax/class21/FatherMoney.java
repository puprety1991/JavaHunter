package com.syntax.class21;

public class FatherMoney {
    void getMoney(){
        System.out.println("i will give my son $500");
    }
}
class SonMoney extends FatherMoney{
    void getMoney(){
        System.out.println("i do not need your money");
    }

}
class TesterMoney{
    public static void main(String[] args) {
        SonMoney money = new SonMoney();
        money.getMoney();
    }
}
