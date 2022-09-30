package com.syntax.review.class03;

public class NestedVsLogicalAnd {
	public static void main(String[] args) {
		
		boolean programmer = true;
		boolean manualTester = true;
		boolean framework = true;
		
		if(programmer && manualTester && framework) {
			System.out.println("You can be Automation Engineer.");
		}else {
			System.out.println("You must know a programmering language and manual testing"+" to be an autmaation engineer.");
		}
		
		System.out.println("<-------------------------------------------------------------------------------------------->");
		
		if(programmer) {
			if(manualTester) {
				if(framework) {
					System.out.println("You can be Automation Engineer.");
				}else {
					System.out.println("You must know a programmering language and manual testing"+" to be an autmaation engineer.");	
				}
			}else {
				System.out.println("You must know a programmering language and manual testing"+" to be an autmaation engineer.");
				
			}
			
		}else {
			System.out.println("You must know a programmering language and manual testing"+" to be an autmaation engineer.");
	
		}
	}

}
