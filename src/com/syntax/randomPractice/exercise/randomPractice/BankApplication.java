package com.syntax.randomPractice.exercise.randomPractice;

public class BankApplication {
	public static void main(String[] args) {
		Account puskar = new Account();
		puskar.userName = "puprety";
		puskar.password = "pass123";
		puskar.accountId = "123";
		puskar.typleOfAccount = "Checking";
		puskar.balance = 2000;
		puskar.limit=200;
		
		boolean isLoggedIn = puskar.login("puprety", "pass123");
		System.out.println(isLoggedIn);
		
		Account prakriti = new Account();
		prakriti.userName = "puskrity";
		prakriti.password = "pass143";
		prakriti.accountId = "121";
		prakriti.typleOfAccount = "Checking";
		prakriti.balance = 5000;
		prakriti.limit=400;
		boolean logedin = prakriti.login("puprety", "pass123");
		
		System.out.println(logedin);
		
		
	}

}
