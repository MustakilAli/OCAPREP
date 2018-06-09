package chapter1;

import java.util.Scanner;

public class ReferenceTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Hello, what is your name:");
		java.util.Date today;
		String greeting;
		today = new java.util.Date();
		greeting = scan.next();
		System.out.println("Today is: " + today + " and also, hello: " + greeting);
		System.out.println();
		

	}

}
