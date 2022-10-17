package com.syntax.class23;
public abstract class Animal {
    abstract void eat();
    abstract void sleep();
}
class Cat extends Animal {
    @Override
    void eat(){
        System.out.println("Cats like fish");
    }
    void sleep(){
        System.out.println("Cats like to sleep 12 to 13  hours");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Cats like red meat");
    }
    void sleep(){
        System.out.println("Cats like to sleep at least 6 hours");
    }
}
class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger like raw meat");//if we do not override other method then we can put abstract in the class
    }
    void sleep(){
        System.out.println("Tiger like to sleep at least 5 hours");
    }
}
class TesterAnimal{
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.eat();


    }
}
//if we put abstract in class, we are not able to create the object because there is noting inside the method