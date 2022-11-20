package com.alg.linear.queue;

public class Queue {

	private Node first;
	private Node last;
	private int size;

	public Queue() {
		// Constructor
		first = null;
		last = null;
		size = 0;
	}

	public void enqueue(int newElement) {
		Node newNode= new Node(newElement);
		newNode.setNextNode(first);
		
		if(size==0) {
			first= newNode;
		} else {
			last.setNextNode(newNode);
		}
		last = newNode;
			
		size++;
	}
	
	public int dequeue() {

		if (size == 0) {
			return 0;
		}
		int value = first.getValue();
		first = first.getNextNode();
		size--;

		if (size == 0) {
			last = null;
		}
		return value;
	}

	public int peek() {
		return first.getValue();
	}


	public int getSize() {
		return size;
	}
}
