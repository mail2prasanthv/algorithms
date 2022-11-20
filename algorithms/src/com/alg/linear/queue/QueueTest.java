package com.alg.linear.queue;

import java.util.Arrays;

public class QueueTest {

	public static void main(String[] args) {

		Queue stack = new Queue();
//		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());
		stack.enqueue(20);
//		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());
		stack.enqueue(30);
//		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());
		stack.dequeue();
//		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());
		stack.dequeue();
//		System.out.println("list: " + Arrays.toString(stack.getElementsAsArray()) + " Size:" + stack.getSize());

	}
}
