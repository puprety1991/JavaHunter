package com.syntax.Lambda.practice;

public interface Student {
    double getAvg(int sub1, int sub2, int sub3);

}
class StudentA{
    public static void main(String[] args) {
        Student student= StudentA::getAvg;
        System.out.println(student.getAvg(80,70,90));
        

    }


    private static double getAvg(int sub1, int sub2, int sub3) {
        return (sub1 + sub2 + sub3) / 3;
    }
}
