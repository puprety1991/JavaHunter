package com.syntax.practice;

import java.util.Scanner;

public class practice {
	 public static void main(String[] args){
		    String[] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Satuarday","Sunday"};
		  
		    Scanner scan = new Scanner(System.in);
		    for(int i=0; i<day.length; i++){
		      day[i] = scan.next();
		      System.out.println(day[i]);
		     
		      
		    }
		   
		    
		    
		  }

}
