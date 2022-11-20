package com.alg.linear.binaryserachtree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeTest {

	public static void main(String[] args) {

		//Insert
		BinarySearchTree bst = new BinarySearchTree(9);
		bst.insert(20);
		bst.insert(4);
		
		bst.insert(1);
		bst.insert(6);
		bst.insert(15);
		bst.insert(170);
		
		List<Integer> inOrderList = new ArrayList<>();
		bst.dfsInOrderTraversalRecursive(inOrderList);
		System.out.println("InOrder:" + inOrderList);
		
		List<Integer> preOrderList = new ArrayList<>();
		bst.dfsPreOrderTraversalRecursive(preOrderList);
		System.out.println("PreOrder: " + preOrderList);
		
		List<Integer> posrOrderList = new ArrayList<>();
		bst.dfsPostOrderTraversalRecursive(posrOrderList);
		System.out.println("PostOrder:" +posrOrderList);
//		
//		System.out.println("150:" + bst.lookup(150));
//		System.out.println("50:" + bst.lookup(50));
//		System.out.println("25:" +bst.lookup(25));
//		System.out.println("75:" +bst.lookup(75));
//		System.out.println("125:" +bst.lookup(125));
//		System.out.println("200:" +bst.lookup(200));
//		System.out.println("300:" +bst.lookup(300));
//
//		bst.bfsTraversal(150);
//		bst.bfsTraversal(50);
//		
//		bst.bfsTraversal(25);
//		bst.bfsTraversal(75);
//		bst.bfsTraversal(125);
//		bst.bfsTraversal(200);
//		
//		bst.bfsTraversal(300);
//		bst.dfsInOrderTraversal();
	}
}
