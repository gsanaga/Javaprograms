package com.gsjp.apps;

public class PrimeNumbers3 {

	public static void main(String[] args) {
		int k, i;
		int rem ;
		int n = 15;
		int count = 0;
		
		for(k=1; k<=n; k++)
		{
			for(i=1; i<=k; i++)
			{
				rem = k%i;
				if(rem == 0 )
				count = count+1 ;
			}		
				if(count == 2)
					System.out.println("Number " + k + " is Prime number");
				//else
					//System.out.println("Number " + k + " is not a Prime Number");
		count = 0;
		}

	}
	

}
