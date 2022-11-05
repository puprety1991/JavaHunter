package com.syntax.class26;

import java.util.HashSet;

public class Task6 {
  /*  Create a Set collection that will hold Objects of Student Type.
      In this set we do not care about the insertion order.
      Each student object should have name and studentID.
      Display name of each student.*/
  public static void main(String[] args) {
      Student student1=new Student("Oscar",121);
      Student student2=new Student("Ashely",131);
      Student student3=new Student("Biden",141);
      Student student4=new Student("Trump",151);
      Student student5=new Student("Bill",161);
      HashSet<Student>stu=new HashSet<>();
      stu.add(student1);
      stu.add(student2);
      stu.add(student3);
      stu.add(student4);
      stu.add(student5);
      var iterator = stu.iterator();
      while(iterator.hasNext()){
          var studentInfo=iterator.next();
          String name = studentInfo.name;
          System.out.println(name);
      }
  }
}
class Student{
    String name;
    int studentId;
    Student(String name,int studentId){
        this.name=name;
        this.studentId=studentId;
    }
}
