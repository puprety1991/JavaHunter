package com.syntax.review.class08;

public class Country {
    public String name;
    protected String capital;
    int population;
    private String president;
void getPop(){
    System.out.println("Population: "+population);
}
}
class Peru extends Country{

}
class CountryTester{
    public static void main(String[] args) {
        Peru peru = new Peru();
        peru.capital = "Lima";
        peru.population=22000000;
        //peru.president --> not accessible because of private access modifiers.
        peru.getPop();
    }
}
