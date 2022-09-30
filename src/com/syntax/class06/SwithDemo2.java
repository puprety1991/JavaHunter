package com.syntax.class06;
// switch case is values based
//matching cases must of same data types as a variable
//no duplication in switch case

public class SwithDemo2 {
	public static void main(String[] args) {
		char choice ='M';
		String answer;
		
		switch(choice) {
		case 'Y':
			answer ="Yes";
			break;
		case 'N':
			answer = "No";
			break;
		case 'M':
			answer = "May be";
			break;
		default:
			answer ="Invalid";
			break;		
		}
		System.out.println(answer);
	}

}
//limitation of SWITCH CASE
// switch case cannot use logical operators
// switch case cannot use relational operators
// cannot work with boolean values
// cannot work the double/float and long data types
