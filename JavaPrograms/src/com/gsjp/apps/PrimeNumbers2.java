package com.gsjp.apps;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		int i, k;
		int rem ;
		int n = 15;
		int count = 0;
		for(i=1; i<=n; i++){
			//if(i%2!=0){
				//System.out.println("Number " + i + "is prime");
				
			rem = n%i;
			if(rem == 0 )
				count = count+1 ;
				
								
			}
		//System.out.println(2%10);
		if(count == 2)
			System.out.println("Number " + n + " is Prime number");
		else
			System.out.println("Number " + n + " is not a Prime Number");
		}

	}


