package com.syntax.class04;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isInterview = true;
		String hrRound = "Pass";
		String TechRound = "Pass";
		
		if(isInterview) {
			if(hrRound.equals("Pass")) {
				if(TechRound.equals("Fail")) {
					System.out.println("Congratulation you got the job!");
				}else {
					System.out.println("Good luck for next time");
				}
			}else {
				System.out.println("Unfortunately you are not selected for this role.");
			}
		}else {
			System.out.println("Keep hunting for the Job!");
		}

	}

}
