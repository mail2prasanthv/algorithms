package com.alg.linear.binaryserachtree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

	private Node topNode;
	private int size;

	public BinarySearchTree(int value) {
		// Constructor
		topNode = new Node();
		topNode.setValue(value);
		
		size = 1;
	}

	public void remove(int value) {
//		Node searchedNode = lookup(topNode, value);
//		boolean hasLeftNode = searchedNode.getLeftNode() != null;
//		boolean hasRightNode = searchedNode.getRightNode() != null;

		Node traverseNode = topNode;
		Node parent = topNode;
		while (true) {

			if (value < traverseNode.getValue()) {
				parent = traverseNode;
				traverseNode = traverseNode.getLeftNode();
			} else if (value > traverseNode.getValue()) {
				parent = traverseNode;
				traverseNode = traverseNode.getRightNode();
			} else if (value == traverseNode.getValue()) {
				//found element
				boolean hasLeftNode = traverseNode.getLeftNode() != null;
				boolean hasRightNode = traverseNode.getRightNode() != null;
				boolean isLeafNode =!hasLeftNode && !hasRightNode; // no left and right node
				boolean hasleftAndRight =hasLeftNode && hasRightNode; // no left and right node
				// XOR operation any of the must should be true. Not both.
				boolean hasLeftOrRightNode = hasLeftNode ^ hasRightNode;
				
				boolean isParentsLeftNodeToBeDeleted = (parent.getLeftNode()!= null && parent.getLeftNode().getValue() == value);
				boolean isParentsRightNodeToBeDeleted = (parent.getRightNode()!= null && parent.getRightNode().getValue() == value);
				
				
				if(isLeafNode)  {
					//the found element at the leaf.simply add null to the left or right.
					if(traverseNode.getValue()< parent.getValue()) {
						parent.setLeftNode(null);
					}
					if(traverseNode.getValue()> parent.getValue()) {
						parent.setRightNode(null);
					}
				} else if(hasLeftOrRightNode) {
					Node leafNode = hasLeftNode?traverseNode.getLeftNode():traverseNode.getRightNode();
					
					if(isParentsLeftNodeToBeDeleted) {
						parent.setLeftNode(leafNode);
					} else if(isParentsRightNodeToBeDeleted) {
						parent.setRightNode(leafNode);
					}
				}else if(hasleftAndRight) {
					// find highest value in the leaf, which should be less than the parent and higher than its all leaf nodes.
					Node highestPredessor=  parent.getRightNode();
					if(highestPredessor == null) {
						
					}
					while(true) {
						if(highestPredessor.getLeftNode() == null) {
							break;
						}
						highestPredessor= highestPredessor.getLeftNode();
					}
					if(isParentsLeftNodeToBeDeleted) {
						parent.setLeftNode(highestPredessor);
					} else if(isParentsRightNodeToBeDeleted) {
						parent.setRightNode(highestPredessor);
					}
					highestPredessor.setLeftNode(traverseNode.getLeftNode());
					highestPredessor.setRightNode(traverseNode.getRightNode());
				}
				
				
			}
			
		}

	}

	public void insert(int value) {

		Node newNode = new Node();
		Node searchNode = lookup(topNode, value);

		if (searchNode.getValue() == value) {
			System.out.println("Item already Exists");
		}

		newNode.setValue(value);
		if (value < searchNode.getValue()) {
			searchNode.setLeftNode(newNode);
		} else if (value > searchNode.getValue()) {
			searchNode.setRightNode(newNode);

		}
		size++;

	}

	private Node lookup(Node node, int value) {
		if (value < node.getValue() && node.getLeftNode() != null) {
			return lookup(node.getLeftNode(), value);
		} else if (value > node.getValue() && node.getRightNode()!= null) {
		    return 	lookup(node.getRightNode(), value);
		}

		return node;
	}

	public boolean lookup(int value) {
		Node node = lookup(topNode, value);
		
		return node.getValue()== value;
	}

	public int getSize() {
		return size;
	}
	
	public Node bfsTraversal(int value) {
		System.out.println("" );
		List<Node>  queue  = new ArrayList<>();
		queue.add(topNode);
		int index =0;
		System.out.print("Traversing:" + value + " " );
		do {
			Node currNode = queue.get(index);
			if(currNode== null) {
				System.out.print("->Not Found");
				return null;
			}
			if(currNode.getValue() == value) {
				System.out.print("->Found");
				return currNode;
			} else {
				System.out.print( "->" + currNode.getValue());
				queue.add(currNode.getLeftNode());
				queue.add(currNode.getRightNode());
			}
			index++;
		} while(true);
	}

	public void dfsInOrderTraversal() {

		Node node = topNode;
		List<Integer> inOrderList = new ArrayList<>();
		List<Node> stack = new ArrayList<>();

		while (node != null) {
			Node rightNode = node.getRightNode();
			Node leftNode = node.getLeftNode();
			if (rightNode != null && leftNode != null) {
				stack.add(node);
				node = leftNode;
			} else if (rightNode == null && leftNode != null) {
				stack.add(node);
				node = leftNode;
			} else if (rightNode != null && leftNode != null) {
				stack.add(node);
				node = rightNode;
			} else if (rightNode == null && leftNode == null) {
				inOrderList.add(node.getValue());
				do {
				int index = stack.size() - 1;
				if(index==-1) {
					node=null;
					break;
				}
				inOrderList.add(stack.get(index).getValue());
				node = stack.get(index).getRightNode();
				stack.remove(index);
				}while(node== null);
			}
		}
		System.out.println(inOrderList);

	}
	public void dfsInOrderTraversalRecursive(List<Integer> inOrderList ) {
		dfsInOrderTraversalRecursive(topNode,inOrderList);
	}

	public void dfsInOrderTraversalRecursive(Node node, List<Integer> inOrderList) {
		if (node== null) {
			return;
		}
		if (node.getLeftNode() != null) {
			dfsInOrderTraversalRecursive(node.getLeftNode(), inOrderList);
		}
		inOrderList.add(node.getValue());
		if (node.getRightNode() != null) {
			dfsInOrderTraversalRecursive(node.getRightNode(), inOrderList);
		}
	}

	public void dfsPreOrderTraversalRecursive(List<Integer> inOrderList ) {
		dfsPreOrderTraversalRecursive(topNode,inOrderList);
	}

	public void dfsPreOrderTraversalRecursive(Node node, List<Integer> inOrderList) {
		if (node == null) {
			return;
		}
		inOrderList.add(node.getValue());
		
		if (node.getLeftNode() != null) {
			dfsPreOrderTraversalRecursive(node.getLeftNode(), inOrderList);
		}
		if (node.getRightNode() != null) {
			dfsPreOrderTraversalRecursive(node.getRightNode(), inOrderList);
		}

	}
	
	public void dfsPostOrderTraversalRecursive(List<Integer> inOrderList ) {
		dfsPostOrderTraversalRecursive(topNode,inOrderList);
	}

	public void dfsPostOrderTraversalRecursive(Node node, List<Integer> inOrderList) {

		if (node == null) {
			return;
		}
		if (node.getLeftNode() != null) {
			dfsPostOrderTraversalRecursive(node.getLeftNode(), inOrderList);
		}
		if (node.getRightNode() != null) {
			dfsPostOrderTraversalRecursive(node.getRightNode(), inOrderList);
		}
		inOrderList.add(node.getValue());

	}
}
	
