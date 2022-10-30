package com.syntax.class24;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private double weight;
    public Dog(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }
    void setName(String name){
        if(name.length()>30){
            System.out.println("Name can not be more than 30 letters.Please try again");
        }else if(name.isEmpty()){
            System.out.println("Name can not be empty. Please try again");
        }else{
            this.name=name;
        }
    }
    void setBreed(String breed){
        if(breed.length()>20){
            System.out.println("Breed can not be more than 20 letters.Please try again");
        }else if(breed.isEmpty()){
            System.out.println("Breed can not be empty. Please try again");
        }else{
            this.breed = breed;
        }

    }
    void setAge(int age){
        if(age>20){
            System.out.println("Please use less age something seems wrong here. Are you sure its a dog.");
        }else if(age<0){
            System.out.println("Age can not be negative");
        }else{
            this.age = age;
        }
    }
    void setWeight(double weight){
        if(weight>300){
            System.out.println("Please try less than 300. it looks more of a elephant.");
        }else if(weight<0){
            System.out.println("Negative weight is not allowed. Please try again.");
        }else{
            this.weight=weight;
        }
    }
    String getName(){
        return name;
    }
    String getBreed(){
        return breed;
    }
    int getAge(){
        return age;
    }
    double getWeight(){
        return weight;
    }

    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight);
    }
}
class Test{
    public static void main(String[] args) {
        Dog tommy=new Dog("Tommy","German",150,-1);
        Dog robin=new Dog("Tommy","German",15,20);
        System.out.println(tommy.getName());
        tommy.printInfo();
        robin.printInfo();
    }
}
