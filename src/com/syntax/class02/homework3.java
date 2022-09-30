package com.syntax.class02;

public class homework3 {
	public static void main(String[] args) {
		
		/*
		 * 
		 * Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. 
		 * “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
		 */
		
		int width, height, peri, area;
		width = 5;
		height = 8;
		
		peri = 2 * (width+height);
		area = width*height;
		
		System.out.println("The perimeter of a rectangle with width "+width+ " and height "+height+" is equalt to "+peri+ " and the area is "+area);
		
	}

}
