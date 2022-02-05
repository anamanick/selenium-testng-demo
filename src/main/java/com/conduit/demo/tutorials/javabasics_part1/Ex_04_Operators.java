package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_04_Operators {

	public static void main(String[] args) {
		/*
		 * Java operators
		 */
		
		
		// Assignment Operators
		int a = 10;  
		int b = 20;  
		a+=4; //a=a+4 (a=10+4)  
		b-=4; //b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b);
		
		a*=2; //14*2  
		System.out.println(a);  
		
		a/=2; //28/2  
		System.out.println(a);  
		
		
		// Relational operatrs
		// <, >, <=, >=, , == (equal to), != (not equal to)
		
		
		
		// Logical operator
		// && - AND, || - OR
		int aa = 10;  
		int bb = 5;  
		int cc = 20;  
		System.out.println(aa<bb && aa<cc); //false && true = false  
		System.out.println(aa<cc || aa<bb); //false OR true will true 
		
		
		// Arithmetic
		// -, +, *, /, %
		int a1 = 10;  
		int b1 = 5;  
		System.out.println(a1+b1); //15  
		System.out.println(a1-b1); //5  
		System.out.println(a1*b1); //50  
		System.out.println(a1/b1); //2  
		System.out.println(a1%b1); //0  
		
		

	}

}
