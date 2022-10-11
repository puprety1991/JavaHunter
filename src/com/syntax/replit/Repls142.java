package com.syntax.replit;

public class Repls142 {
    public static void main(String[] args) {
        SyntaxTechnologies name = new SyntaxTechnologies();
        name.display();

        SyntaxTechnologies names = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
        names.display();
    }
}
class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayClass;

    SyntaxTechnologies() {

    }

    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayClass = lastDayClass;
    }

    void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayClass);
    }
}
