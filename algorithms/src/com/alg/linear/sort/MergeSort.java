package com.alg.linear.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	public static void main(String[] args) {

		List<Integer> input = new ArrayList<Integer>();
		input.add(9);
		input.add(8);
		input.add(7);
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(6);
		input.add(5);
		input.add(4);

		mergeSort(input);
		System.out.println(input);
	}

	private static void mergeSort(List<Integer> input) {
		int size = input.size();
		int halfindex = size / 2;
		List<Integer> mergerSort = mergerSort(input.subList(0, halfindex), input.subList(halfindex, size));
		System.out.println(input);
	}

	private static List<Integer> mergerSort(List<Integer> subList1, List<Integer> subList2) {
		List<Integer> merged = new ArrayList<>();

		int size = subList1.size();
		if (size > 1) {
			int halfindex = size / 2;
			return mergerSort(subList1.subList(0, halfindex), subList1.subList(halfindex, size ));
		}

		size = subList2.size();
		if (size > 1) {
			int halfindex = size / 2;
			return  mergerSort(subList1.subList(0, halfindex), subList1.subList(halfindex, size ));
		}

		Integer list1Item = subList1.get(0);
		Integer list2Item = subList2.get(0);
		while (list1Item != null || list2Item != null) {
			int index1 = 0;
			int index2 = 0;

			if (list1Item < list2Item || list2Item == null) {
				merged.add(list1Item);
				subList1.remove(index1);
			} else if (list1Item > list2Item || list1Item == null) {
				merged.add(list2Item);
				subList2.remove(index2);
			}
			list1Item = subList1.get(0);
			list2Item = subList2.get(0);
		}

		return merged;
	}

}