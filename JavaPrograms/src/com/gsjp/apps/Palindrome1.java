package com.gsjp.apps;

public class Palindrome1 {

	public static void main(String[] args) {
		
		String originals = new String(args[0]);
		System.out.println("The original string: "+ originals);
		
		StringBuffer st = new StringBuffer(originals);
		String reverses = st.reverse().toString();
		System.out.println("The reverse string: "+ reverses);
		
		//if(originals.toString().equals(reverses.toString()){
		if(originals.equals(reverses)){
			System.out.println("The input provided is Palindrome");
		}else
			System.out.println("The input provided is NOT Palindrome");
		
	}

}
