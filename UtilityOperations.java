package com.LongIntegerADT;

public class UtilityOperations {

	public static int overflow(int t) {
		int OfDigits = 0;
		String temp  = String.format("%08d", t);
		String temp2 = temp.substring(4, 8);	
		
		OfDigits = Integer.parseInt(temp2);
		return OfDigits;
	}

	public static int underflow(int t) {
		int UfDigits = 0;
		String temp  = String.format("%08d", t);
		String temp2 = temp.substring(0, 4);
			
		UfDigits = Integer.parseInt(temp2);
		return UfDigits;
	}

	public static int digits(int t) {
		char[] digits = new Integer(t).toString().toCharArray();
		return digits.length;
	}
}
