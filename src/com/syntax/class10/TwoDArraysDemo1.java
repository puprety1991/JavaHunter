package com.syntax.class10;

public class TwoDArraysDemo1 {
	public static void main(String[] args) {
		String[][] countries = {
				{"America","Canada","Mexico","Panama","Costa Rica"},
				{"Brazil","Columbia","Argentina"},
				{"South Africa","Nigeria","Kenya","Ghana"},
				{"India","Nepal","Pakistan","Afganistan","Bangladesh"},
				{"United Kingdom","France"}
		};
		System.out.println(countries.length); // 5 - total # of arrays or rows
		int elementOf1Array = countries[0].length;
		System.out.println("# of elements frome 1 Array: "+elementOf1Array);
		
		int elementOf2Array = countries[1].length;
		System.out.println("# of elements frome 2 Array: "+elementOf2Array);
		System.out.println();
		
		System.out.println("--> Getting all values for 2D Arrays <--");
		System.out.println();
		
		System.out.println("--------- Regular For Loop -------------");
		for(int row=0; row<countries.length; row++) {
			for(int col =0; col<countries[row].length; col++) {
				
				System.out.print(countries[row][col]+" ");
				
			}
			
			System.out.println();
		
		}
		System.out.println("--------- Enhanced For Loop -------------");
	
		for(String[] country:countries) {
			for(String desh:country) {
				System.out.println();
				if(desh.equalsIgnoreCase("Nepal")) {
					
					System.out.println(desh+" is my Home Country.");
				}else {
					System.out.print(desh+" ");
				}
				
			}
			System.out.println();
		}
	}

}
