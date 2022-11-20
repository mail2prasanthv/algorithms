package com.alg.linear.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Graph {

	private Map<Integer, List<Integer>> value;

	public Graph() {
		value = new HashMap<>();
	}

	public void addVertex(int newElement) {
		value.put(Integer.valueOf(newElement), new ArrayList<>());
	}
	
	public void addEdge(int edge1, int edge2) {
		value.get(edge1).add(edge2);
		value.get(edge2).add(edge1);
	}
	public void printConnection() {
		
		for (Entry<Integer, List<Integer>> entry : value.entrySet()) {
			System.out.println(entry);
		}
		
	}
}
