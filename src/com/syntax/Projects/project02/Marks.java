package com.syntax.Projects.project02;
/*
    We have to calculate the average of marks obtained in three subjects by
    student A and by student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as
    its parameters and the marks in four subjects as its parameters for student B. Test your code
*/
public abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks{
    double scoreMath;
    double scoreScience;
    double scoreEnglish;

    StudentA(double scoreMath,double scoreScience,double scoreEnglish){
        this.scoreMath=scoreMath;
        this.scoreScience=scoreScience;
        this.scoreEnglish=scoreEnglish;

    }
    @Override
    double getPercentage() {
        return (scoreMath+scoreScience+scoreEnglish)/3;
    }
}
class StudentB extends Marks{
    double scoreMath;
    double scoreScience;
    double scoreEnglish;
    double scoreArts;
    StudentB(double scoreMath,double scoreScience,double scoreEnglish,double scoreArts){
        this.scoreMath=scoreMath;
        this.scoreScience=scoreScience;
        this.scoreEnglish=scoreEnglish;
        this.scoreArts=scoreArts;
    }
    @Override
    double getPercentage() {
        return (scoreMath+scoreScience+scoreEnglish+scoreArts)/4;
    }
}
class MarksTester{
    public static void main(String[] args) {
        Marks[] score ={new StudentA(78,87,74),new StudentB(89.5,76,80,93)};
        System.out.println();
        for(Marks avg:score){
            System.out.println("The Average Percentage of Student is: "+avg.getPercentage()+"%");
        }
    }
}
