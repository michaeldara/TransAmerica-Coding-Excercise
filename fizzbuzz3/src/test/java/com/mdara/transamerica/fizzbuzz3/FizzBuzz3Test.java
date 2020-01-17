package com.mdara.transamerica.fizzbuzz3;
import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

/**
* The FizzBuzz3Test Junit test program tests the FizzBuzz3 class by passing sequence numbers 
* from 1 to 20 and validates the results.
*
* @author  Michael Dara
* @version 1.0
* @since   2020-01-16 
*/
public class FizzBuzz3Test {


	@Test
	public void returnsErrorForNoInput() {
		String[] str = {};
		String expected = "Please enter a range of numbers from 1 to 20";
		assertEquals(expected, FizzBuzz3.fizzBuzz(str));
	}
	
	@Test
	public void returnsErrorForNonNumericInput() {
		String[] str = {"1", "a", "b", "4"};
		String expected = "Non-numeric input entered. Please enter a valid range of numbers from 1 to 20";
		assertEquals(expected, FizzBuzz3.fizzBuzz(str));
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
		assertEquals(expected, FizzBuzz3.fizzBuzz(str));
	}
	
	
	@Test
	/**
	 * test returns correct counts for different multiples.
	 */
	public void returnsCorrectCountsForMultiples() {
		String[] str = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		String expectedString = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";
		
		assertEquals(expectedString, FizzBuzz3.fizzBuzz(str));
		
		Map<String, Integer> result = FizzBuzz3.getCounts(FizzBuzz3.fizzBuzz(str));
		
		Integer expectedFizzCount = 4;
		assertEquals(expectedFizzCount, result.get("fizz"));
		
		Integer expectedBuzzCount = 3;
		assertEquals(expectedBuzzCount, result.get("buzz"));
		
		Integer expectedFizzBuzzCount = 1;
		assertEquals(expectedFizzBuzzCount, result.get("fizzbuzz"));
		
		Integer expectedLuckyCount = 2;
		assertEquals(expectedLuckyCount, result.get("lucky"));
		
		Integer expectedIntegerCount = 10;
		assertEquals(expectedIntegerCount, result.get("integer"));

	}
	 
}
