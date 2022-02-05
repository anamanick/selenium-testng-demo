package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_02_DataTypes_byteDataType {

	public static void main(String[] args) {
		
		/*
		 * Java as two main types of data types;
		 *  	i) Primitive data types
		 *  	ii) Non-primitive data types
		 */
		
		
		/*
		 * i) Primitive data types are;
		 * 		1) byte - we are here
		 * 		2) short
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
		
		// Example of 1) byte (min -128 to max 127)
		//===========================================
		
		byte a = 10;
		byte b = -20;
		
		// byte limit test demonstration
		//byte c = 128;
		//byte d = - 129;
		
		// Results in action
		System.out.println("My bite data type is : "+ a);
		System.out.println("My another bite data type is : "+ b);
		System.out.println("My bite data addition result : "+ (a - b));
		

	}

}
