package com.syntax.class19;

public class Faculty {
    /*
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */
    static String printF(){
        return "Harry Potter";
    }
}
class IT extends Faculty{

}
class FacultyTester{
    public static void main(String[] args) {
        IT obj = new IT();
        System.out.println(obj.printF());

    }
}