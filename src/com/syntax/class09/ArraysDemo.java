package com.syntax.class09;

public class ArraysDemo {
	public static void main(String[] args) {
		int a[] = {2, 5, 4, 6,4,34,54};
		int len = a.length;
		for(int i=1; i<len; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] array = new int[4];
		array[0] = 3;
		array[1] = 4;
		array[2] = 43;
		array[3] = 34;
		len = array.length;
		for(int i=0; i<len;i++) {
		
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//Lets create an array and store your classmates
		String[] name = new String[3];
		name[0] = "Prakriti";
		name[1] = "Loves";
		name[2] = "Puskar";
		
		System.out.println(name[0]+" "+name[1]+" "+name[2]);
	}

}
