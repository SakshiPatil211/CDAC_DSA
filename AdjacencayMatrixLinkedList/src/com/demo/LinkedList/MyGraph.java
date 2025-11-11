package com.demo.LinkedList;

public class MyGraph {
	MyLinkedList[] graph;
	
	public MyGraph(int v) {
		this.graph = new MyLinkedList[v];
		//initialize all linked list to null
		for(int i=0;i<this.graph.length;i++) {
			graph[i] = new MyLinkedList();
		}
	}
	
	//add edge between source and destination
	public void addEdge(int source, int dest) {
		graph[source].addNode(dest);
	}
	
	//print graph
	public void printGraph() {
		for(int i=0;i<graph.length;i++) {
			System.out.println(i+ "--->");
			graph[i].displayList();
		}
	}
}
