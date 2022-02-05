package com.conduit.demo.tutorials.javabasics_part1;

public class Ex_05_ControlStatements_Switch {

	public static void main(String[] args) {
		
		//Declaring a variable for switch expression  
	    int number = 20;  
	    
	    //Switch expression  
	    switch(number){
	    
	    	//Case statements  
	    	case 10:
	    		System.out.println("10");  
	    		break;  
	    	
	    	case 20: 
	    		System.out.println("20");  
	    		break;  
	    	
	    	case 30: 
	    		System.out.println("30");  
	    		break;  
	    	
	    	//Default case statement  
	    	default:
	    		System.out.println("Not in 10, 20 or 30");  
	    }
	    
	    
	    //Specifying month number  
	    int month=7;    
	    
	    String monthString="";  
	    
	    //Switch statement  
	    
	    switch(month){    
		    //case statements within the switch block  
		    case 1: monthString="1 - January";  
		    	break;    
		    case 2: monthString="2 - February";  
		    	break;    
		    case 3: monthString="3 - March";  
		    	break;    
		    case 4: monthString="4 - April";  
		    	break;    
		    case 5: monthString="5 - May";  
		    	break;    
		    case 6: monthString="6 - June";  
		    	break;    
		    case 7: monthString="7 - July";  
		    	break;    
		    case 8: monthString="8 - August";  
		    	break;    
		    case 9: monthString="9 - September";  
		    	break;    
		    case 10: monthString="10 - October";  
		    	break;    
		    case 11: monthString="11 - November";  
		    	break;    
		    case 12: monthString="12 - December";  
		    	break;    
		    default:System.out.println("Invalid Month!");    
	    }
	    //Printing month of the given number  
	    System.out.println(monthString); 

	}

}
