package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_05_ControlStatements_ForLoops {

	public static void main(String[] args) {
	
		// For Loops
		
		// Simple for loops
		//Code of Java for loop  
		System.out.println("For loop");
		for(int i=1;i<=10;i++){  
	        System.out.println(i);  
	    }
	    
	    
	    // For each loop
	    // Declaring an array
	    System.out.println("For Each loop");
	    int items[]={12,23,44,56,78};  
	    
	    //Printing array using for-each loop  
	    for(int item:items){
	        System.out.println(item);  
	    }  

	}

}
