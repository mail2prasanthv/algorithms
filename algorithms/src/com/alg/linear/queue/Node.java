package com.alg.linear.queue;

public class Node {

	private int value;
	private Node nextNode;
	
	public Node(int value, Node nextNode) {
		super();
		this.value = value;
		this.nextNode = nextNode;
	}
	
	public Node(int value) {
		super();
		this.value = value;
	}
	public Node() {
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
