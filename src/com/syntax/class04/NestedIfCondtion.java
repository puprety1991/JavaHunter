package com.syntax.class04;

public class NestedIfCondtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time =3;
		String day ="Monday";
		
		if(day.equals("Monday")) {
			if(time>7) {
				System.out.println("Lets go to office");
			}
		if(time<6) {
			System.out.println("Lets sleep more");
		}
		}

	}

}
