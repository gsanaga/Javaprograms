package com.gsjp.apps;

public class monthFinder2 {

	public static void main(String[] args) {
		
		String [] months = new String[13];
		months[0] = "January"  ;
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		months[12] = "Beyond month boundary";
		
		int i, n;
		n = 6;
		
		for(i=1; i<=n; i++){
						
			if(i==n) System.out.println("Month " + i + ": " + months[i-1]);
			
			//else if(n > 13) 
				//System.out.println("Beyond month boundary");
			
			//break;
		}
		 
	}

}
