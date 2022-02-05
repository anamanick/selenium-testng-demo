package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_03_Variables {
	
	/*
	 * Java has three main types of variables
	 * 
	 * 		i) 	 local variable 	- Created inside a method
	 * 		ii)	 instance variable 	- not static but outside of a method
	 * 		iii) static variable 	- declared with static keyword
	 * 
	 */
	
	static int a =100; // static variable outside of method

	public static void main(String[] args) {
		
		int b = 200; // Instance variable 
	}
	
	
	public void myStaticVariable() {
		int myAge = 30; // Local variable
		System.out.println("My Age "+ myAge);
	}

}
