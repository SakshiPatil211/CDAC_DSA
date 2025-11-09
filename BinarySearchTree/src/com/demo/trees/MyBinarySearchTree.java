package com.demo.trees;

public class MyBinarySearchTree {
	Node root;
	class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public MyBinarySearchTree() {
		root = null;
	}
}
