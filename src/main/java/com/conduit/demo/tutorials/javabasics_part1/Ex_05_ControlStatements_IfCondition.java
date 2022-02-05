package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_05_ControlStatements_IfCondition {

	public static void main(String[] args) {
		
		
		// variables
		int x = 10;    
		int y = 12;    
		
		
		// if statement
		// is condition within if block proves to be true only when following block will be executed
		if(x+y > 20) {    
			System.out.println("x + y is greater than 20");    
		}    
		
		
		// if then else
		if(x+y < 10){  
			System.out.println("x + y is less than      10");  
		}else{  
			System.out.println("x + y is greater than 20");  
		}  
		
		// is then else if else 
		String city = "Orlando";
		
		if(city == "Miami") {  
			System.out.println("city is Miami");  
		}else if (city == "Jacksonville") {  
			System.out.println("city is jacksonville");  
		}else if(city == "Orlando") {  
			System.out.println("city is orlando");  
		}else {  
			System.out.println(city);  
		}

	}

}
