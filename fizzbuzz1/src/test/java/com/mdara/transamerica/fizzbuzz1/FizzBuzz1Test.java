package com.mdara.transamerica.fizzbuzz1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
* The FizzBuzz1Test Junit test program tests the FizzBuzz1 class by passing sequence numbers 
* from 1 to 20 and validates the result
*
* @author  Michael Dara
* @version 1.0
* @since   2020-01-16 
*/
public class FizzBuzz1Test {


	@Test
	public void returnsErrorForNoInput() {
		String[] str = {};
		String expected = "Please enter a range of numbers from 1 to 20";
		assertEquals(expected, FizzBuzz1.fizzBuzz(str));
	}
	
	@Test
	public void returnsErrorForNonNumericInput() {
		String[] str = {"1", "a", "b", "4"};
		String expected = "Non-numeric input entered. Please enter a valid range of numbers from 1 to 20";
		assertEquals(expected, FizzBuzz1.fizzBuzz(str));
	}
	
	@Test
	public void returnsFizzForMultiplesOf3() {
		String[] str = {"1", "2", "3", "9", "11", "12", "19"};
		String expected = "1 2 fizz fizz 11 fizz 19";
		assertEquals(expected, FizzBuzz1.fizzBuzz(str));
	}
	
	@Test
	public void returnsBuzzForMultiplesOf5() {
		String[] str = {"1", "2", "5", "10", "11", "19", "20"};
		String expected = "1 2 buzz buzz 11 19 buzz";
		assertEquals(expected, FizzBuzz1.fizzBuzz(str));
	}
	
	@Test
	public void returnsFizzBuzzForMultiplesOf15() {
		String[] str = {"1", "2", "15", "19", "20"};
		String expected = "1 2 fizzbuzz 19 buzz";
		assertEquals(expected, FizzBuzz1.fizzBuzz(str));
	}
	
	@Test
	/**
	 * test returns:
	 * fizz for multiples of 3
	 * buzz for multiples of 5
	 * fizzbuzz for multiples of 15
	 * integer for all other numbers
	 */
	public void returnsCorrectValuesForMultiples() {
		String[] str = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		String expected = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";
		assertEquals(expected, FizzBuzz1.fizzBuzz(str));
	}
}