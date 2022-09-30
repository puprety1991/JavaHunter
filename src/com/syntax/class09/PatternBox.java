package com.syntax.class09;

public class PatternBox {
	public static void main(String[] args) {
		for(int r =1; r<=5; r++) {
			for(int c =1; c<=5; c++) {
				if(r==2 && c==2) {
					System.out.println(" ");
					continue;
				}else if(r==2 && c==3) {
					System.out.println(" ");
					continue;
				}else if(r==2 && c==4) {
					System.out.println("");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
