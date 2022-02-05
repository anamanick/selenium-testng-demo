package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_02_DataTypes_Array {

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
		
		
		
		// Simple array
		// Declaration
		int myArr[] = new int[3];
		
		myArr[0] = 100;
		myArr[1] = 500;
		myArr[2] = 600;
		//myArr[3] = 1000;
		
		System.out.println("myArr length : "+ myArr.length);
		
		
		// Array Examples
		int myIntArr[] = {2,5,6,8,9};
		
		System.out.println(myIntArr.length);
		System.out.println("I need item no "+ myIntArr[3]);
		
		
		// Array example with for loop
		for (int item: myIntArr) {
			System.out.println("Item : "+ item);
		}
		
		
	
	
	}

}
