package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_02_DataTypes_shortDataType {

	public static void main(String[] args) {
		
		/*
		 * Java as two main types of data types;
		 *  	i) Primitive data types
		 *  	ii) Non-primitive data types
		 */
		
		
		/*
		 * i) Primitive data types are;
		 * 		1) byte
		 * 		2) short - we are here
		 * 		3) int
		 * 		4) long
		 * 		5) float
		 * 		6) double
		 * 		7) char
		 * 		8) boolean	
		 */
		
		/*
		 * ii) Non-Primitive data types are;
		 * 		1) class
		 * 		2) object
		 * 		3) String
		 * 		4) Array
		 * 		5) Interfaces	
		 */
		
		
		//===========================================
		// Example of 1) short (min -32768 to max 32767), default value is 0
		//===========================================
		
		short a = 2000;
		short b = -5000;
		
		// short limit test demonstration
		//short c = 33000;
		//short d = - 33000;
		
		// Results in action
		System.out.println("My short data type is : "+ a);
		System.out.println("My another short data type is : "+ b);
		System.out.println("My short data addition result : "+ (a - b));
		

	}

}
