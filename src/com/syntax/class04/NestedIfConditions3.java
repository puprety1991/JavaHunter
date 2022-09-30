package com.syntax.class04;

public class NestedIfConditions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double moneyInMyAccount = 10000;
		String season = "Spring";
		if(season.equals("Spring")) {
			if(moneyInMyAccount>300000) {
				System.out.println("Let's go vacation");
			}else {
				System.out.println("I need save more money");
			}
		}else {
			System.out.println("Not good season");
		}

	}

}
