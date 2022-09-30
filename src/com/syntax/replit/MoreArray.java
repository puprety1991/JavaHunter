package com.syntax.replit;

public class MoreArray {
	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	    int zero = 0;
	    int total =0;
	    for(int i=0; i<a.length; i++){
	      total=0;
	      for(int j=0; j<a[i].length; j++){
	        total+=a[i][j];
	         
	          
	        }
	      if(total<zero) {
	    	  if(total %2 !=0) {
	    		  System.out.print(total*-1+" ");
	    	  }
	      }
	     
	       
	      }
	      
	    }
	    
	}


