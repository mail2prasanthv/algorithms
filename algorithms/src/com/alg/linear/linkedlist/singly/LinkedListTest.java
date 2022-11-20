package com.alg.linear.linkedlist.singly;

import java.util.Arrays;

public class LinkedListTest {

	public static void main(String[] args) {
		
		   LinkedList myLinkedList = new LinkedList(10);
	        //append
	        myLinkedList.append(12);
	        myLinkedList.append(16);
	        myLinkedList.append(5);
	        System.out.println("list: " + Arrays.toString(myLinkedList.getElementsAsArray()) + " Size:" + myLinkedList.getSize());
	        //prepend
	        myLinkedList.prepend(20);
	        myLinkedList.prepend(50);
	        System.out.println("list: " + Arrays.toString(myLinkedList.getElementsAsArray()) + " Size:" + myLinkedList.getSize());
//	        //insert
	        myLinkedList.insert(2, 25);
	        System.out.println("list: " + Arrays.toString(myLinkedList.getElementsAsArray()) + " Size:" + myLinkedList.getSize());
	        myLinkedList.insert(4, 25);
	        System.out.println("list: " + Arrays.toString(myLinkedList.getElementsAsArray()) + " Size:" + myLinkedList.getSize());
	        
//	        System.out.println("length: " + myLinkedList.getLength());
//	        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
//	        //remove
	        myLinkedList.remove(4);
	        System.out.println("list: " + Arrays.toString(myLinkedList.getElementsAsArray()) + " Size:" + myLinkedList.getSize());
	        myLinkedList.remove(1);
	        System.out.println("list: " + Arrays.toString(myLinkedList.getElementsAsArray()) + " Size:" + myLinkedList.getSize());
//	        System.out.println("length: " + myLinkedList.getLength());
//	        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
//	        //reverse
	        myLinkedList.reverse(); 
	        System.out.println("list: " + Arrays.toString(myLinkedList.getElementsAsArray()) + " Size:" + myLinkedList.getSize());
	}
}
