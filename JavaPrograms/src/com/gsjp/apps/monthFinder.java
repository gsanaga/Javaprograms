package com.gsjp.apps;

public class monthFinder {

	public static void main(String[] args) {
		
		String [] months = new String[12];
		
		
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
		
		int i, n;
		n = 11;
		
		
		//for(arraymonth[]=1; arraymonth[] <= n; arraymonth++){
		for(i=0; i<months.length; i++){
			//System.out.println(i);
			System.out.println(i+1 + " : " + months[i]);
		}

	}

}
