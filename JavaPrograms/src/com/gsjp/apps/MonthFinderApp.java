package com.gsjp.apps;

import com.gsjp.operators.MonthFinder;

public class MonthFinderApp {

	public static void main(String[] args) {
		
		MonthFinder test1 = new MonthFinder();
		try {
			test1.findMonth("4");
		} catch (NotValidInput | NotValidNumber e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
