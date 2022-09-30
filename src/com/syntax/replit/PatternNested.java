package com.syntax.replit;

public class PatternNested {
		public static void main(String[] args) {
			/*
			 * $$$$
			   $  $
			   $  $
               $$$$
			 */
			for(int i=0; i<4; i++){
			      for(int j=1; j<5; j++){
			        if(i==1 && j==2 ){
			        	System.out.print(" ");
			          continue;
			        }else if(i ==1 && j==3){
			        	System.out.print(" ");
			          continue;
			        }else if(i==2 && j==2 ){
			        	
			        	System.out.print(" ");
				          continue;
				    }else if(i ==2 && j==3){
				        	System.out.print(" ");
				          continue;
				        }
			        System.out.print("$");
			      }
			      System.out.println();
			}
			    }
		}


