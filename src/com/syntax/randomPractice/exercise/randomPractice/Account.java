package com.syntax.randomPractice.exercise.randomPractice;

public class Account {
	String accountId;
	String userName;
	String password;
	double balance;
	double limit;
	String typleOfAccount;
	boolean isBlocked;
	
	boolean login(String enteredUserName, String enteredpassword) {
		if(userName.equalsIgnoreCase(enteredUserName) && password.equalsIgnoreCase(enteredpassword)) {
			return true;
		}else {
			return false;
		}
		
	}

}
