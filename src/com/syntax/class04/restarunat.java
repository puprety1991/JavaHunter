package com.syntax.class04;

public class restarunat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHungry = true;
		boolean isCombo = true;
		double balance = 200;
		double combo = 25;
		double sandwichOnly = 12;
		
		if(isHungry) {
			if(isCombo) {
				if(balance>combo) {
					System.out.println("Enjoy you combo meal!");
				}else {
					System.out.println("Not enough balance.");
				}
			}else if(balance>sandwichOnly) {
				System.out.println("Enjoy your sandwich!");
			}else {
				System.out.println("Not enough balance.");
			}
		}else {
			System.out.println("You are not hungry, Visit next time.");
		}

	}

}
