package com.syntax.class14;

public class ScoreMethod {
    /*
    Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F
     */
    char StudentGrade(double math, double computer, double science, double socialStudy, double arts) {
        double avg = (math + computer + science + socialStudy + arts) / 5;
        char grade = 0;
        if (avg <= 100 && avg >= 90) {
            grade = 'A';
        } else if (avg < 90 && avg >= 80) {
            grade = 'B';
        } else if (avg < 80 && avg >= 70) {
            grade = 'C';
        } else if (avg < 70 && avg >= 50) {
            grade = 'D';
        } else if (avg < 50 && avg >= 0) {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        ScoreMethod student1 = new ScoreMethod();
        System.out.println("You grade is "+student1.StudentGrade(99,98,96,85,90));
    }
}
