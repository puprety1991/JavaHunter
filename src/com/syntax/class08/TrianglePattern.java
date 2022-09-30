package com.syntax.class08;

public class TrianglePattern {
	 public static void main(String[] args)
	   {
	      final int SIZE = 6;

	      for (int i = 1; i <= SIZE; i++)
	      {
 	         for (int j = 1; j <= i; j++)
	         {
	            System.out.print("*");
	         }

	         System.out.println();
	      }
	 
	   }
	 /*
	  * i = 1, j=1 = * 
	  * i =2 , j=1,2 = **
	  * i =3, j =1,2,3= ***
	  * i = 4, j= 1,2,3,4 = ****
	  * i =5, j = 1,2,3,4,5 = *****
	  * i = 6, j = 1,2,3,4,5,6 = ******
	  */

}


