package com.alg.linear.sort;
public class InsertioionSort {
	public static void main(String[] args) {

		int[] input = new int[] { 9, 8, 7, 1, 2, 3, 6, 5, 4 };
		insertionSort(input);
	}

	private static void insertionSort(int[] input) {
		
		for(int i=1;i<input.length;i++) {
				for (int j=0; j<i;j++) {
					if(input[i] < input[j]) {
						//swap
						int temp = input[i];
						input[i] = input[j];
						input[j] = temp;
					}
			}
			
		}
		System.out.println();
	}
}