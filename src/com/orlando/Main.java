package com.orlando;

/**
 * The main application entry point.
 */
public class Main {

    /**
     * Starts the application with the given command-line arguments.
     *
     * @param args command-line arguments
     */
	public static void main(String[] args) {
		
		//Calculate a number of mathematical problems using recursion!
		System.out.println("Summation of 10 : " + RecursiveMath.summation(10));
		System.out.println("Summation of 72 : " + RecursiveMath.summation(72));
		
		System.out.println();
		System.out.println("Factorial of 4 : " + RecursiveMath.factorial(4));
		System.out.println("Factorial of 8 : " + RecursiveMath.factorial(8));

	}

}
