package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_02_DataTypes_longDataType {

	public static void main(String[] args) {
		
		/*
		 * Java as two main types of data types;
		 *  	i) Primitive data types
		 *  	ii) Non-primitive data types
		 */
		
		
		/*
		 * i) Primitive data types are;
		 * 		1) byte
		 * 		2) short 
		 * 		3) int - we are here
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
		// Example of 1) long (min -2147483648 to max 2147483647), default value is 0 - 64 bit data type
		//===========================================
		
		long a = 100000L;
		long b = -200000L;
		
		
		// Results in action
		System.out.println("My long data type is : "+ a);
		System.out.println("My long data type is : "+ b);
		System.out.println("My long data addition result : "+ (a - b));
		

	}

}
