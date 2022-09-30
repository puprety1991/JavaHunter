package com.syntax.replit;

public class MoreArrays {
	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	    int sum = 0;
	    for(int i=1;i<a.length; i+=2){
	      for(int j=0;j<a[i].length; j++){
	        sum+=a[i][j];
	        
	      }
	    }
	    System.out.println(sum);
	    
			 
			 
	}

}
