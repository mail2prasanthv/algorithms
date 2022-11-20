package com.alg.linear.recursive;

public class Stack {

	private Node top;
	private Node bottom;
	private int size;

	public Stack() {
		// Constructor
		top = null;
		bottom = null;
		size = 0;
	}

	public void push(int newElement) {
		Node newNode= new Node(newElement);
		newNode.setNextNode(top);
		
		top = newNode;
		if(size ==0 ) {
			bottom = top;
		} 		
		size++;
	}
	
	public int pop() {

		if (size == 0) {
			return 0;
		}
		int value = top.getValue();
		top = top.getNextNode();
		size--;

		if (size == 0) {
			bottom = null;
		}
		return value;
	}

	public int peek() {
		return top.getValue();
	}

	public int[] getElementsAsArray() {
		int[] elements = new int[size];
		Node node = top;
		int i = 0;
		while (node != null) {
			elements[i] = node.getValue();
			node = node.getNextNode();
			i++;
		}

		return elements;
	}
	public int getSize() {
		return size;
	}
}
