package com.syntax.class19;

public class A {
    /*
    Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
     */
    String name;
    String lastName;
    public A(String name,String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    void info(){
        System.out.println(name+" "+lastName);
    }

}
class B extends A{
    String addr;
    public B(String name,String lastName,String addr){
        super(name,lastName);
        this.addr = addr;
    }

}
class C extends B{
    String phone;
    public C(String name,String lastName,String addr,String phone){
    super(name,lastName,addr);
    this.phone=phone;
}
void info(){
    System.out.println("First Name: "+name+", Last Name: "+lastName+", Address: "+addr+", Phone: "+phone);
}
}
class ATester{
    public static void main(String[] args) {
        C c = new C("Robin","Trump","4450 James Madison","706-43-5467");
        c.info();
    }
}