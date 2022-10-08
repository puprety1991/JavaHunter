package com.syntax.GroupStudy;

public class Constructor {
      /*
    Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class:
     1 - inside same class; 2 - from outside the class; 3 - from different class inside
      different package  and observe result.
     */
    private String fname;
    private String lname;
    private int age;
    private double height;
    private double weight;
    private boolean isEducated;


    private Constructor(String pfname, String plname){
        fname = pfname;
        lname = plname;
    }
    public Constructor(int page){

        age = page;
    }
    Constructor(double pheight, double pweight, boolean pisEducated){
        height = pheight;
        weight = pweight;
        isEducated=pisEducated;
    }
    protected Constructor(){

    }
    private void info(){
        System.out.println(fname+" "+lname);
    }
    void printInfo(){
        if(isEducated){
            System.out.println("Height: "+height+", Weight: "+weight);
        }else{
            System.out.println("No Info!!");
        }
    }
    public String ageInfo(){
        if(age<=19 && age>=13){
            return "You  become Teenager.";
        }else{
            return "You are not Teenager.";
        }
    }

    public static void main(String[] args) {

        Constructor person = new Constructor("joe","biden");
        person.info();
    }


}
