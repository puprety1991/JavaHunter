package com.syntax.randomPractice.exercise.practice;

public class bankFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bal = 4000;
		double transferAmount =20000;
		boolean isWillingToTransfer =false;
		
		if(isWillingToTransfer){
			
		
			if(bal>transferAmount) {
				System.out.println("you successsfully transfered");
			}else {
				System.out.println("Not enough balance");
		   }	
		}else {
			System.out.println("Not interested to transfer the money");
		}

	}

}
