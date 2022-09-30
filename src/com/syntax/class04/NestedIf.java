package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {
		boolean isHungry= true;
		double balance = 20;
		double Burmoney = 10;
		
		if(isHungry) {
			if(balance>Burmoney) {
				System.out.println("Enjoy your burger");
			}else {
				System.out.println("Do not have enought balance");
			}
		}else {
			System.out.println("Keep walking");
		}
		
	}

}
