package com.syntax.class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task5 {
  /*
    Create a Map that will store Employee name and salary. Write a logic to retrieve
    an employee who gets the highest salary. Output should be in the below format
    John Smith=$100000
    */
  public static void main(String[] args) {
      Map<String,Integer>employees = new HashMap<>();
      employees.put("Sarah Johnson",45000);
      employees.put("Harry Khan",120000);
      employees.put("Robin Sharma",78000);
      employees.put("Henry biden",98000);
      employees.put("Raju Patel",56000);

      Set<Map.Entry<String, Integer>> entries = employees.entrySet();

      int highest = 0;
      var name="";

      for(var getInfo:entries){
          var salary = getInfo.getValue();
          name = getInfo.getKey();
          if(salary>highest){
              highest=salary;
          }
      }
      System.out.println(name+"= $"+highest);
  }
}
