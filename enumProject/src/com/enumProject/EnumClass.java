package com.enumProject;

public class EnumClass {
	enum day{
		sunday,monday,tuesday,wednesday,thursday,friday,saturday
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day today=day.monday;
		
		switch(today) {
		
		case sunday:
			System.out.println("it's Sunday");
			break;
			
		case monday:
			System.out.println("it's monday");
			break;
		
		}
		
		
		 System.out.println("\nAll days of the week:");
	        for (day d : day.values()) {
	            System.out.println(d);
	        }
	        
	        
	     System.out.println("index of constant values");
	     for(day d:day.values()) {
	    	 System.err.println("ordinal values"+d.ordinal());
	    	 
	     }
	     
	     System.out.println("name of constant values");
	     for(day d:day.values()) {
	    	 System.err.println("ordinal values="+d.name());
	    	 
	     }
	        
	    
		

	}

}
