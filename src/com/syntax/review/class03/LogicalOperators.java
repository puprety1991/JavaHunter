package com.syntax.review.class03;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean programmer = true;
		boolean manualTester = true;
		boolean framework = true;
		
		if(programmer && manualTester && framework) {
			System.out.println("You can be Automation Engineer.");
		}else {
			System.out.println("You must know a programmering language and manual testing"+" to be an autmaation engineer.");
		}

	}

}
