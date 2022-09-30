package com.syntax.class07;

public class ForLoopDemo {
	public static void main(String[] args) {
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		for(int i = 20; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		for(int i =0; i<=10; i+=2)
		{
			System.out.print(i+" ");
			}
		System.out.println();
		System.out.println("-----------------------------------------");
		int sum = 0;
		for(int i =1; i<=6;i++) {
			sum+=i;
		}
		System.out.println(sum);
		}

}
