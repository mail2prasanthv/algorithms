package com.alg.linear.stack;

import java.util.Arrays;

public class FibonacciRecursive {

	public static void main(String[] args) {

		int fib  = fibonacciRecursive(8);
		System.out.println(fib);
//		 fibonacciIterative(5);
	}

	private static void fibonacciIterative(int limit) {
		int prev = 0;
		int curr = 1;

		System.out.print(prev + "," + curr + ",");
		for (int i = 2; i < limit; i++) {
			int fib = prev + curr;
			System.out.print(fib + ",");
			prev = curr;
			curr = fib;
		}
		
	}

	private static int fibonacciRecursive(int limit) {

		if(limit < 2) {
			return limit;
		}
		 
		return fibonacciRecursive(limit -1) + fibonacciRecursive(limit -2) ;
		
	}
}
