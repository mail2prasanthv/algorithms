package com.alg.linear.recursive;

import java.util.Arrays;

public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack();
		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());
		stack.push(20);
		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());
		stack.push(30);
		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());
		stack.pop();
		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());
		stack.pop();
		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());

	}
}
