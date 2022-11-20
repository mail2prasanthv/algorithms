package com.alg.linear.linkedlist.doubly;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public DoublyLinkedList(int initialValue) {
		// Constructor
		head = new Node(initialValue);
		head.setNextNode(null);
		head.setPrevNode(null);
		tail = head;
		size = 1;
	}

	public void append(int newElement) {
		//add element to the tail end
		Node newNode = new Node(newElement);
		newNode.setNextNode(null);// no further elements
		newNode.setPrevNode(tail);
		
		tail.setNextNode(newNode);
		tail = newNode;// setting new tail
		size++;
	}
	
	public void prepend(int newElement) {
		//add element to the head
		Node newHead = new Node(newElement);
		newHead.setNextNode(head);
		newHead.setPrevNode(null);
		
		head.setPrevNode(newHead);
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
		newNode.setPrevNode(nodeAtIndex);
		newNode.getNextNode().setPrevNode(newNode);
		
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
		// skip one node
		Node nextNode = nodeAtIndex.getNextNode().getNextNode();
		nodeAtIndex.setNextNode(nextNode);
		nextNode.setPrevNode(nodeAtIndex);
		size--;
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
