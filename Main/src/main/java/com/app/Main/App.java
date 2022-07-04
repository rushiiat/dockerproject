package com.app.Main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(checkIfInputIsAnEvenNumber(122));
    }

	private static boolean checkIfInputIsAnEvenNumber(int number) {
	
		return number % 2 == 0;
	}
}
