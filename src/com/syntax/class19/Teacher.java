package com.syntax.class19;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have
    it their own features and behaviour. Test all 4 classes
     */
    String name;
    String lname;
    int age;
    Teacher(String name,String lname,int age){
        this.name=name;
        this.lname=lname;
        this.age=age;
    }
    void Info(){
        System.out.println("First Name: "+name);
        System.out.println("Last Name: "+lname);
        System.out.println("Age: "+age);
    }
}
class MathTeacher extends Teacher{
    int expYear;
    MathTeacher(String name,String lname,int age,int expYear){
        super(name,lname,age);
        this.expYear=expYear;
    }
    void salary(){
        if(expYear>5){
            System.out.println("You salary above 100K when your age "+age);
        }else{
            System.out.println("You salary below 100K when your age "+age);
        }
    }

}
class ChemistryTeacher extends Teacher{
    String education;
    ChemistryTeacher(String name,String lname,int age,String education){
        super(name,lname,age);
        this.education=education;
    }
    String Promotion(){
        if(education.equalsIgnoreCase("Master")){
            System.out.println("Name: "+name);
            return "You have chance to get Promoted.";
        }else{
            return "Get at least Master degree.";
        }
    }
}
class PianoTeacher extends Teacher{
    boolean isProfession;
    PianoTeacher(String name,String lname,int age, boolean isProfession){
        super(name,lname,age);
        this.isProfession=isProfession;
    }
    void Play(){
        if(isProfession){
            System.out.println(lname+", Please play Piano For Us.");
        }else{
            System.out.println(lname+", Keep Trying!!");
        }
    }


}
class TeacherTester{
    public static void main(String[] args) {
        System.out.println("-- Parent Class --");
        Teacher teacher = new Teacher("Harry","Patel",25);
        teacher.Info();
        System.out.println();
        System.out.println("-- MathTeacher Class --");
        MathTeacher mathTeacher = new MathTeacher("Andrew","Chopra",31,6);
        mathTeacher.salary();
        System.out.println();
        System.out.println("-- ChemistryTeacher Class --");
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher("Jim","Carry",46,"Master");
        System.out.println(chemistryTeacher.Promotion());
        System.out.println();
        System.out.println("-- PianoTeacher Class --");
        PianoTeacher pianoTeacher = new PianoTeacher("Adnan","Sami",52,true);
        pianoTeacher.Play();

    }
}
