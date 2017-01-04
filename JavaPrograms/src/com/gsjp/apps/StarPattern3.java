package com.gsjp.apps;

public class StarPattern3 {

	public static void main(String[] args) {
		
		try{
		int noOfLines = Integer.parseInt(args[0]);
		
		for(int lineNumber = 1; lineNumber <= noOfLines; lineNumber++){
			
			
			for(int lineCounter = 1; lineCounter <= lineNumber; lineCounter++){
				System.out.print("*");
			}
			System.out.println();	
		}
				
		
		} catch(NumberFormatException exp){
			System.out.println("Please give a valid number and not a character");
		}

	}
}


