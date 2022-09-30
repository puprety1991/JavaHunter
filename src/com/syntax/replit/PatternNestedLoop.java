package com.syntax.replit;

public class PatternNestedLoop {
		
		/*
		 *1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7  
		 */
		public static void main(String[] args) {
			int j;
			for (int i = 7; i >= 1; i--) {
				for (j = 1; j <= i; j++) {
					System.out.print(j + " ");

				}
				System.out.println();
			}
			for (int i = 1; i <= 7; i++) {
				if (i == 1) {
					continue;
				}
				for (j = 1; j <= i; j++) {

					System.out.print(j + " ");

				}
				System.out.println();
			}

		}
}


