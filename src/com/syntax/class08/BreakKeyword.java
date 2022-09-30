package com.syntax.class08;

public class BreakKeyword {
	public static void main(String[] args) {
		for(int i=1; i<5; i++) {
			System.out.println("Hello");
			if(i == 3) {
				break;
			}
		}
		boolean hungry = true;
		while(hungry) {
			System.out.println("Give me food");
			break;
		}
	}

}
