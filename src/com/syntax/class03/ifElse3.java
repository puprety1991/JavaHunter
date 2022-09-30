package com.syntax.class03;

public class ifElse3 {
	public static void main(String[] args) {

		boolean isHungry = true;
		if (isHungry) {
			System.out.println("Lets eat something yummy");
		}
		if (3 > 2) {
			System.out.println("True statement in inside paretheses");
		}
		double myBankBalance = 2000;
		double theAmountToTransfer = 250;

		if (myBankBalance > theAmountToTransfer) {
			System.out.println("funds transfered successfully");
		} else {
			System.out.println("Please try again not enough balance");
		}

	}

}
