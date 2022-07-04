package com.app.Main;

public class Main {

	 public static void main( String[] args )
	    {
	    	System.out.println(checkIfInputIsEvenNumber(122));
	    }

		public static boolean checkIfInputIsEvenNumber(int number) {
		
			return number % 2 == 0;
		}
	
}
