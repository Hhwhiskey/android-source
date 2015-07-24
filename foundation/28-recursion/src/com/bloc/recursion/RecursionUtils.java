package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 * 
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	
	
	
	public static final int findMaxRecursively(List<Integer> numbers) {
		
		/*int currentMax = 0;		
		for (int i=0; i < numbers.size(); i++) {			
			if (numbers.get(i) > currentMax) {
				currentMax = numbers.get(i);
			}
		}
		System.out.println("Array= " + numbers);
		System.out.println("Max = " + currentMax);
		return currentMax;*/
		
		
		
	     // start with the terminal condition
		if (numbers.size() == 1) {
			return numbers.get(0);
		}
		int a = numbers.get(numbers.size()-1);
		int b = numbers.get(numbers.size()-2);
		System.out.println("Array= " + numbers);
		
		if (a > b) {
			numbers.add(numbers.size()-2, a);			
		} 
		numbers.remove(numbers.size()-1);
		
		return findMaxRecursively(numbers);
		
		
	
	
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
		//return 0;
	}
}