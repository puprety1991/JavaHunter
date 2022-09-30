package com.syntax.randomPractice.exercise.randomPractice;

public class Phone {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.brand = "Iphone";
		phone.color="Rose";
		phone.model="14";
		
		phone.call("708 420 7476");
		phone.dial();
		phone.pics();
		phone.text("'Hello, how are you?'");
		
	}

}
