package com.syntax.class04;

import java.util.Scanner;

public class InputFromTheUser {
	public static void main(String[] args) {
		
		boolean isPass = true;
		double percentage;
		double total;
		Scanner input = new Scanner(System.in);
		
		if(isPass) {
			System.out.print("Enter you score for the Math: ");
			int mathScore = input.nextInt();
			System.out.print("Enter you score for the Science: ");
			int scienceScore = input.nextInt();
			System.out.print("Enter you score for the Computer: ");
			int compScore = input.nextInt();
			
			total = mathScore+scienceScore+compScore;
			percentage = (total/300)*100;
			
			if(percentage == 1000 & percentage >= 90) {
				System.out.println("You have "+percentage+"%. so that you got A.");
			}else if(percentage >=80 & percentage < 90) {
				System.out.println("You have "+percentage+"%. so that you got B.");
			}else if(percentage >=70 & percentage < 80) {
					System.out.println("You have "+percentage+"%. so that you got C.");
			}else if (percentage<70) {
				System.out.println("You have "+percentage+"%. so that you got D.");
			}else {
				System.out.println("You input invalid score! Please valid Score");
		}
		}else{
			System.out.println("You have failed the class!");
		}
		
		
		
	}

}
