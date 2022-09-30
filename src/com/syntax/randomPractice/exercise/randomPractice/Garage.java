package com.syntax.randomPractice.exercise.randomPractice;

public class Garage {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.NumOfDoor = 4;
		car1.color = "Silver";
		car1.make = "Honda";
		car1.model= "Civic";
		car1.size = 4;
		car1.engine = "1.5L Engine";
		
		
		Car car2 = new Car();
		car2.NumOfDoor = 2;
		car2.color = "White";
		car2.make = "Toyota";
		car2.model= "Corolla";
		car2.size = 4;
		car2.engine = "2.0L Engine";
		
		System.out.println("car1.make: "+car1.make);
		System.out.println("car2.make: "+car2.make);
		
	}

}
