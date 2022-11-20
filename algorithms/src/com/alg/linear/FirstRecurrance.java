package com.alg.linear;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurrance {
	public static void main(String[] args) {
		
		int[] arr = { 1, 5, 8, 5, 7, 8, 8, 7, 4, 4, 10 };
		System.out.println(getFirstRecurringObjectusingNestedLoop(arr));
		System.out.println(getFirstRecurringObjectBetterUsingSet(arr));
		
	}

	private static int getFirstRecurringObjectBetterUsingSet(int[] arr) {
		// using set
		// more space complexity - introduced new object of type set
		// time complexity O(n)
		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i])) {
				return arr[i];
			}
			set.add(arr[i]);
		}
		
		return 0;
	}

	private static int getFirstRecurringObjectusingNestedLoop(int[] arr) {
		// no space complexity
		//time complexity O(n^2)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}

			}

		}
		return 0;
	}

}
