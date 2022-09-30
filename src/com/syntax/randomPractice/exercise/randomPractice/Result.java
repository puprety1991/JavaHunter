package com.syntax.randomPractice.exercise.randomPractice;

public class Result {
	double avg;
	double math;
	double english;
	double science;
	double socialStudy;
	double computer;
	double total;
	
	
	void totalScore() {
		total=math+english+science+socialStudy+computer;
	}
	void average() {
		avg = (total)/5;
		if(avg>0 && avg<=100) {
			System.out.println("Your Average Score is "+avg);
		}
		
	}
	
	void grade() {
		if(avg>=80 && avg<=100){
			System.out.println("You have distinction");
			}
		else if(avg>=60 && avg<80) {
			
			System.out.println("You have First Division");
		}
       else if(avg>=50 && avg<60) {
			
			System.out.println("You have Second Division");
		}
       else if(avg>=40 && avg<50) {
			
			System.out.println("You have Third Division");
		}
       else if(avg<40 && avg>0) {
			
			System.out.println("You have Failed. Good Luck for next year!!");
		}
       else {

    		   System.out.println("Please Enter Valid Scores!!");
    		
    		   
    	   
    	  
       }
}
	

}
