package com.syntax.class10;

public class TwoDArrayTask {
	public static void main(String[] args) {
		/*
		 * Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
After storing values print following String:
Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		String[][] name = {{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
				
		         };
		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println(name[0][0]+" "+name[1][3]);
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][1]);
		
		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names 
		 * and second array will contain grades. 
		 * Then your program should print name of the students that has A and B grade
		 */
		System.out.println();
		
		String[][] result = {{"Oscar","Don","Dale","Joe"},
				{"A","B","C","D"}
				
		};
		System.out.println(result[0][0]+" has got '"+result[1][0]+"' grade.");
		System.out.println(result[0][1]+" has got '"+result[1][1]+"' grade. ");
		System.out.println(result[0][2]+" has got '"+result[1][2]+"' grade. ");
		System.out.println(result[0][3]+" has got '"+result[1][3]+"' grade. ");
		System.out.println("-----------> Regular for Loop <----------------");
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.print(result[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("--> Enhanced For Loop <--");
		for(String[] singleArray:result) {
			for(String output:singleArray) {
				System.out.print(output+" ");
				
			}
			System.out.println();
		}
				
	}

}
