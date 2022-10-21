package com.syntax.review.class09;

public class Fruits {
    protected String name;
    String shape;
    private String color;
    public static boolean isFresh=true;
    public static void havePeel(){
        System.out.println("Most of the fruits needs to be peel");
    }
    public Fruits(String name){
        this.name=name;
    }
   Fruits(String name,String shape,String color){
        this(name);
        this.shape=shape;
        this.color=color;
    }
    public void grow(){
        System.out.println("All fruits grow fresh? "+isFresh);
    }
    protected void haveBenefits(){
        System.out.println("All fruits good for your health");
    }
}
class Apple extends Fruits{
   /* public Apple(String name){
        super(name);
    }*/
    String size;
    String taste;
    double price;
    Apple(String name,String shape, String color,String size,String taste){
        super(name,shape,color);
        this.size=size;
        this.taste=taste;
    }
    Apple(String name,String shape, String color,String size,String taste,double price){
        this(name,shape,color,size,taste);
        this.price=price;
    }
    void makeJuice(){
        System.out.println("From "+name+" we can make "+ taste+" juice.");
    }
    void makeJuice(String fruit){
        System.out.println("From mixing "+name+" and "+fruit+" we can make "+ taste+" juice.");
    }
    public static void main(String[] args) {
        Apple app = new Apple("Apple","circle","red","medium","sweet");
        System.out.println("Fruits: "+app.name);
        System.out.println("Fruits taste: "+app.taste);
        app.grow();
        app.haveBenefits();
        app.makeJuice();
        app.makeJuice("Orange");
    }
}
class Banana extends Fruits{
    String origin;
    Banana(String name,String shape,String color,String origin){
        super(name,shape,color);
        this.origin=origin;
    }
    void makeSmoothie(){
        System.out.println("from "+name+" we get tasty smoothie");
    }
    public void grow(){
        System.out.println("banana are growing");
    }

    public static void main(String[] args) {
        Banana kola = new Banana("banana","bananaShape","yellow","nepal");
        kola.grow();
        kola.makeSmoothie();
        havePeel();
    }
}

