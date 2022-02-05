package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_02_DataTypes_floatDataType {

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
		 * 		3) int
		 * 		4) long
		 * 		5) float - we are here
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
		// Example of 1) 32 bit single precision datatype
		//===========================================
		
		float a = 100.5f;
		float b = -10000.7f;
		
			
		// Results in action
		System.out.println("My float data type is : "+ a);
		System.out.println("My float data type is : "+ b);
		System.out.println("My float data addition result : "+ (a - b));
		

	}

}
