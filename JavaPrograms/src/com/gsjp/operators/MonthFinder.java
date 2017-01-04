package com.gsjp.operators;

import com.gsjp.apps.NotValidInput;
import com.gsjp.apps.NotValidNumber;

public class MonthFinder {

public String findMonth(String monthNumber)
		throws NotValidInput, NotValidNumber
{
	String monthname = "" ;
	try {
		
	int monNum = Integer.parseInt(monthNumber);
	
	if(monNum > 12 || monNum <=0){
		throw new NotValidNumber();
	}
	
	switch(monNum){
	case 1:
		monthname = "January";
		System.out.println(monthname);
		break;
	case 2:
		monthname = "February";
		System.out.println(monthname);
		break;
	case 3:
		monthname = "March";
		System.out.println(monthname);
		break;
	case 4:
		monthname = "April";
		System.out.println(monthname);
		break;
	case 5:
		monthname = "May";
		System.out.println(monthname);
		break;
	case 6:
		monthname = "June";
		System.out.println(monthname);
		break;
	case 7:
		monthname = "July";
		System.out.println(monthname);
		break;
	case 8:
		monthname = "August";
		System.out.println(monthname);
		break;
	case 9:
		monthname = "September";
		System.out.println(monthname);
		break;
	case 10:
		monthname = "October";
		System.out.println(monthname);
		break;
	case 11:
		monthname = "November";
		System.out.println(monthname);
		break;
	case 12:
		monthname = "December";
		System.out.println(monthname);
		break;
	default:
		System.out.println("Invalid entry.");
		break;
	}
	
	//System.out.println( monthname);
	
	} catch(NumberFormatException exp){ 
	throw new NotValidInput();
	
		//System.out.println("Please enter valid number between 1 and 12");
	}
	return monthname;
}
}
