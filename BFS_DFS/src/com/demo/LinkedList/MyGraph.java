package com.demo.LinkedList;
import com.demo.stack.*;
import com.demo.queue.*;

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

	public void dfsTraversal(int start) {
		boolean[] visited = new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			visited[i] = false;
		}
		
		MyGenericStackList<Integer> st = new MyGenericStackList<Integer>();
		st.push(start);
		String dfs = " ";
		while(!st.isEmpty()) {
			int v = st.pop();
			if(!visited[v]) {
				dfs += v + ",";
				visited[v] = true;
				//get all adjacent node of v
				int[] arr = new int[graph.length];
				for(int i=0;i<graph.length;i++) {
					arr[i] = -1;
				}
				graph[v].getAdjacentNodes(arr);
				for(int i=0;i<graph.length;i++) {
					if(arr[i]!=-1 && !visited[arr[i]]) {
						st.push(arr[i]);
					}
				}
			}
		}
		System.out.println("DFS " +  dfs);
	}

	public void bfsTraversal(int start) {
		boolean[] visited = new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			visited[i] = false;
		}
		
		MyGenericQueueList<Integer> que = new MyGenericQueueList<Integer>();
		que.enQueue(start);
		String bfs = " ";
		while(!que.isEmpty()) {
			int v = que.deQueue();
			if(!visited[v]) {
				bfs += v + ",";
				visited[v] = true;
				//get all adjacent node of v
				int[] arr = new int[graph.length];
				for(int i=0;i<graph.length;i++) {
					arr[i] = -1;
				}
				graph[v].getAdjacentNodes(arr);
				for(int i=0;i<graph.length;i++) {
					if(arr[i]!=-1 && !visited[arr[i]]) {
						que.enQueue(arr[i]);
					}
				}
			}
		}
		System.out.println("BFS " +  bfs);
	}
}
