package com.syntax.randomPractice.exercise.practice;

public class ArrayDemo03 {
	public static void main(String[] args) {
		char[] grade = {'A','B','C','D','E','F'};
		char secndVal = grade[1];
		
		String[] names = {"prakriti", "deepa","puskar","adrian","Saroj","Babita"};
		String secondVal = names[1];
		
		for(int i=0; i<grade.length; i++) {
			char valueFromArray = grade[i];
			System.out.print(valueFromArray+" ");
			
		}
		for(int j=0; j<names.length; j++) {
			String getValue = names[j];
			System.out.println(getValue);
			
		}
	}

}
