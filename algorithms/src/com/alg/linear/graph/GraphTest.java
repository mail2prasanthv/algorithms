package com.alg.linear.graph;

import java.util.Arrays;

public class GraphTest {

	public static void main(String[] args) {

		Graph graph = new Graph();
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		//node:0
		graph.addEdge(0,2);
		//node:1
		graph.addEdge(1,2);
		graph.addEdge(1,3);
		//node:2
		graph.addEdge(2,3);
		

		graph.printConnection();
	}
}
