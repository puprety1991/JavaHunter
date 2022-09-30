package com.syntax.randomPractice.exercise.randomPractice;

public class Shoping {

	public static void main(String[] args) {
		ShoppingComplex prakriti = new ShoppingComplex();
		prakriti.halfpantPrice = 434;
		prakriti.shoesPrice = 334;
		prakriti.slipperPrice = 30;
		prakriti.tShirtPrice = 34;
		prakriti.walletPrice = 200;
		prakriti.creditCardLimit = 504;
		prakriti.isCard = true;
		prakriti.isCash = false;
		
		//prakriti.shopping();
		
		ShoppingComplex puskar = new ShoppingComplex();
		puskar.halfpantPrice = 200;
		puskar.shoesPrice = 700;
		puskar.slipperPrice = 148;
		puskar.tShirtPrice = 150;
		puskar.walletPrice = 120;
		puskar.creditCardLimit = 1000;
		puskar.isCard = true;
		puskar.isCash = false;
		
		puskar.shopping();
		
		
		

	}

}
