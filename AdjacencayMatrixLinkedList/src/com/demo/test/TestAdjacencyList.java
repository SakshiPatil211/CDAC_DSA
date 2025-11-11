package com.demo.test;
import java.util.*;
import com.demo.LinkedList.*;

public class TestAdjacencyList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int v = sc.nextInt();
		MyGraph g = new MyGraph(v);
		storeGraph(g,v);
		g.printGraph();
	}
	
	private static void storeGraph(MyGraph g, int v) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("is there edge between "+i+"-->"+j);
				int val = sc.nextInt();
				if(val>0) {
					g.addEdge(i,j);
				}
			}
		}
	}

}
