package com.syntax.class05;

public class LogicalOR {
	public static void main(String[] args) {
		boolean understandJava = true;
		boolean enjoyJava = false;
		boolean practice = true;
		
		if(understandJava || enjoyJava || practice) {
			System.out.println("It is true statement.");
		}else {
			System.out.println("It is false statement.");
			
		}
		System.out.println("------------------------------");
		String day = "satuarday";
		if(day.equalsIgnoreCase("Satuarday") || day.equalsIgnoreCase("sunday")) {
			System.out.println("I have a Java class at Syntax.");
		}
		System.out.println("*******************************");
		double money = 90000;
		String title = "QA Analyst";
		if(title.equals("QA Analyst") || money == 95000) {
			System.out.println("Happy");
		}
	}

}
