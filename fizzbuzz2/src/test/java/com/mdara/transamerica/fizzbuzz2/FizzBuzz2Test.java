package com.mdara.transamerica.fizzbuzz2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
* The FizzBuzz2Test Junit test program tests the FizzBuzz2 class by passing sequence numbers 
* from 1 to 20 and validates the results.
*
* @author  Michael Dara
* @version 1.0
* @since   2020-01-16 
*/
public class FizzBuzz2Test {


	@Test
	public void returnsErrorForNoInput() {
		String[] str = {};
		String expected = "Please enter a range of numbers from 1 to 20";
		assertEquals(expected, FizzBuzz2.fizzBuzz(str));
	}
	
	@Test
	public void returnsErrorForNonNumericInput() {
		String[] str = {"1", "a", "b", "4"};
		String expected = "Non-numeric input entered. Please enter a valid range of numbers from 1 to 20";
		assertEquals(expected, FizzBuzz2.fizzBuzz(str));
	}
	
	@Test
	public void returnsLuckyWhenNumberHas3InIt() {
		String[] str = {"1", "2", "3", "11", "13", "19"};
		String expected = "1 2 lucky 11 lucky 19";
		assertEquals(expected, FizzBuzz2.fizzBuzz(str));
	}

	@Test
	/**
	 * test returns:
	 * lucky for a number that has 3 in it
	 * fizz for multiples of 3
	 * buzz for multiples of 5
	 * fizzbuzz for multiples of 15
	 * integer for all other numbers
	 */
	public void returnsCorrectValuesForMultiples() {
		String[] str = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";
		assertEquals(expected, FizzBuzz2.fizzBuzz(str));
	}
}