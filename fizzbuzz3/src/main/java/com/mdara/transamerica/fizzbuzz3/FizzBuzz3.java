package com.mdara.transamerica.fizzbuzz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
* The FizzBuzz3 program implements an application that simply displays lucky if the integer has a number 3, buzz for multiples of 5
* and fizzbuzz for multiples of 15 else display the actual number and generates a report.
*
* @author  Michael Dara
* @version 1.0
* @since   2020-01-16 
*/
public class FizzBuzz3 {

    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(generateReport(FizzBuzz3.fizzBuzz(args)));
	}

	
	/**
	 * 
	 * @param args
	 * @return String
	 */
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
	
	
	/**
	 * 
	 * @param str
	 * @returns String
	 */
	public static String generateReport(String str) {

		Map<String, Integer> countMap = getCounts(str);

	    StringBuilder sb = new StringBuilder(str);
		sb.append("\n");
		Set<String> keySet = countMap.keySet();
		Iterator<String> iter = keySet.iterator();
		String key = null;
		while( iter.hasNext() ) {
			key = iter.next();
			sb.append(key.concat(": ")).append(countMap.get(key)).append("\n");
		}
		
		return sb.toString().trim();
	}
	

	public static Map<String, Integer> getCounts(String str) {
		
		List<String> myList = new ArrayList<String>(Arrays.asList(str.split(" ")));
		
		int fizz = Collections.frequency(myList, "fizz");
		int buzz = Collections.frequency(myList, "buzz");
		int fizzbuzz = Collections.frequency(myList, "fizzbuzz");
		int lucky = Collections.frequency(myList, "lucky");
		int integer = myList.size() - (fizz + buzz + fizzbuzz + lucky);

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("fizz", fizz);
		map.put("buzz", buzz);
		map.put("fizzbuzz", fizzbuzz);
		map.put("lucky", lucky);
		map.put("integer", integer);
		
		return map;
		
	}
	
	

}
