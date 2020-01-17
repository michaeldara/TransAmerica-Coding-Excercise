package com.mdara.transamerica.fizzbuzz2;

/**
* The FizzBuzz2 program implements an application that simply displays lucky if the integer has a number 3, buzz for multiples of 5
* and fizzbuzz for multiples of 15 else display the actual number.
*
* @author  Michael Dara
* @version 1.0
* @since   2020-01-16 
*/
public class FizzBuzz2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(FizzBuzz2.fizzBuzz(args));
	}

	public static String fizzBuzz(String[] args) {
		
		if( args.length == 0 ) {
			return "Please enter a range of numbers from 1 to 20";
		}
			
		int num = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for( String str: args) {
			
			if( str.indexOf('3') != -1) {
				sb.append("lucky ");
				continue;
			}
				
			try {
				num = Integer.parseInt(str);
			} catch( Exception ex ) {
				return "Non-numeric input entered. Please enter a valid range of numbers from 1 to 20";
			}
			
			if( num%15 == 0 )
				sb.append("fizzbuzz ");
			else if( num%5 == 0 )
				sb.append("buzz ");
			else if( num%3 == 0 )
				sb.append("fizz ");
			else
				sb.append(num).append(" ");
		}

		return sb.toString().trim();
		
	}
	

}
