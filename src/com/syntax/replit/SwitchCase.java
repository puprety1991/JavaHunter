package com.syntax.replit;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		/*
		 * Prompt user with questions: "Please enter your favorite car make"
         - if user enters  BMW -->  carOrigin = "german car"
         - if user enters  Toyota -->  carOrigin = " japanese car"
         - if user enters  Maserati -->  carOrigin = "italian car"
        - anything else besides those values --> carOrigin = "unknown"
		 */
		 Scanner input = new Scanner(System.in);
		    System.out.println("Please enter your favorite car make");
		    String make = input.next();
		    String favourite="null";

		    switch(make.toUpperCase()){
		      case "BMW":
		        favourite = "german car";// case value needs to be upper case
		        break;
		      case "TOYOTA":
		        favourite = "japanese car";
		        break;
		      case "MASARATI":
		        favourite = "italian car";
		        break;
		      default:
		        favourite = "unknown";
		        break;
		    }
		    System.out.println("Your favorite car is "+favourite);
	}

}
