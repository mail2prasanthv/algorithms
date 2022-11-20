package com.alg.linear;

public class Prg6_MergeSortedArrays {
	public static void main(String[] args) {

		int[][] arrays2D = { { 3, 10, 25, 45 }, { 1, 7, 15, 30, 46 } };
		int[] arrays1D = new int[9];

//		System.out.println(arrays2D.length);
		for (int i = 0; i < arrays2D.length; i++) {
			for (int j = 0; j < arrays2D[i].length; j++) {

				int pos = arrays1D.length - 1;
				for (; pos >= 0; pos--) {
					if(arrays1D[pos] ==0) {
						continue;
					}
					if (arrays1D[pos] < arrays2D[i][j]) {
						break;
					}
				}
				arrays1D[pos] = arrays2D[i][j];

			}
		}
		System.out.println(arrays1D.toString());

	}

}
