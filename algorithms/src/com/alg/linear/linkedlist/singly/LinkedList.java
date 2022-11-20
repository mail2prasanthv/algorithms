package com.alg.linear.linkedlist.singly;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size;

	public LinkedList(int initialValue) {
		// Constructor
		head = new Node(initialValue);
		head.setNextNode(null);
		tail = head;
		size = 1;
	}

	public void append(int newElement) {
		//add element to the tail end
		Node newNode = new Node(newElement);
		newNode.setNextNode(null);// no further elements
		tail.setNextNode(newNode);
		tail = newNode;// setting new tail
		size++;
	}
	
	public void prepend(int newElement) {
		//add element to the head
		Node newHead = new Node(newElement);
		newHead.setNextNode(head);
		head = newHead;//setting  new head
		size++;
	}

	public void insert(int index, int newElement) {
		// insert element at index position
		if (index > size+1) {
			System.out.println("Invalid Index");
			return;
		}
		//iterate till the index position
		Node nodeAtIndex = head;
		for (int i=0; i< index-1;i ++) {
			nodeAtIndex = nodeAtIndex.getNextNode();
		}
		//create new node and add links
		Node newNode = new Node(newElement);
		newNode.setNextNode(nodeAtIndex.getNextNode());
		
		nodeAtIndex.setNextNode(newNode);
		size++;
	}

	public void remove(int index) {
		if (index > size) {
			System.out.println("Invalid Index");
			return;
		}
		//iterate till the index position
		Node nodeAtIndex = head;
		for (int i=0; i< index-1;i ++) {
			nodeAtIndex = nodeAtIndex.getNextNode();
		}
		// setting next node as next to next node
		// removing reference
		nodeAtIndex.setNextNode(nodeAtIndex.getNextNode().getNextNode());
		size--;
	}

	public void reverse() {
	
		Node prevNode = head;
		Node currNode = head.getNextNode();
		Node nextNode = currNode.getNextNode();
		
		while(nextNode != null) {
			currNode.setNextNode(prevNode);// reversing the link direction
			prevNode = currNode;
			currNode = nextNode;
			nextNode = currNode.getNextNode();
		}
		currNode.setNextNode(prevNode);
		head.setNextNode(null);
		
		tail = head; // head has turned to tail  
		head =currNode;// 
		
		
	}
	public int[] getElementsAsArray() {
		int[] elements = new int[size];
		Node node = head;
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
