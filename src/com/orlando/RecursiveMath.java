package com.orlando;

public class RecursiveMath {
	
	/**
	 * Calculate the mathematical summation of the given number.<br>
	 *   - Example:  Given n = '5,' the summation is: 5 + 4 + 3 + 2 + 1 + 0 
	 * @param n : the number to perform the summation on.
	 * @return the summation at the completion of recursion
	 */
	public static int summation(int n) {
			
		if (n <= 0) {	//Base Case
			return n;
			
		} else {		//Recursive Case... keep re-calling itself until the base case is reached!
			return n + summation(n - 1);
		}
	}
	
	
	
	/**
	 * Calculate the Factorial of the given integer.
	 * @param n : given number
	 * @return Factorial solution
	 */
	public static int factorial(int n) {
		
		if (n <= 1) {
			return n;
			
		} else {
			return n * factorial(n - 1);
		}
	}
	
	
	/**
	 * Perform recursion to calculate the result of exponentiation of any
	 * number to the power of any exponent.
	 * @param number
	 * @param power
	 * @return
	 */
	public static int exponentCalculation(int number, int power) {
		
		if (power <= 1) {
			return number;
			
		} else {
			return number * exponentCalculation(number, power - 1);
		}
	}
	

}
