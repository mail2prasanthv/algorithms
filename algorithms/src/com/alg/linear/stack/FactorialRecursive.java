package com.alg.linear.stack;

import java.util.Arrays;

public class FactorialRecursive {

	public static void main(String[] args) {

		int factorial = factorialRecursive(5);
		System.out.println(factorial);
		factorial = factorialIterative(5);
		System.out.println(factorial);
	}

	private static int factorialIterative(int limit) {
		int factorialRecursive = 1;
		for (int i = 1; i <= limit; i++) {
			factorialRecursive = factorialRecursive * i;
		}
		return factorialRecursive;
	}

	private static int factorialRecursive(int i) {

		if (i == 1) {
			return i;//base case
		}
		return factorialRecursive(i - 1) * i;

	}
}
