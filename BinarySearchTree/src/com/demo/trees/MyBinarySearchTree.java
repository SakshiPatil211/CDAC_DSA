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
	
	public void insertNode(int key) {
		root = insertData(root, key);
	}

	private Node insertData(Node root, int key) {
		Node newNode = new Node(key);
		// tree is empty, terminating condition for recursion
		if(root == null) {
			root = newNode;
			return root;
		} else {
			if(key < root.data) {
				root.left = insertData(root.left, key);
			} else {
				root.right =insertData(root.right, key);
			}
			return root;
		}
	}
	
	public void inorder() {
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.println(root.data + " ");
			inorderTraversal(root.right);
		}
	}
	
	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		if(root != null) {
			System.out.println(root.data + " ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	public void postorder() {
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {
		if(root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.data + " ");
		}
	}
	
	public void deleteNode(int key) {
		root = deleteData(root, key);
	}

	private Node deleteData(Node root, int key) {
		if(root == null) {
			return root;
		}
		if(key < root.data) {
			root.left = deleteData(root.left, key);
		} else if(key > root.data) {
			root.right = deleteData(root.right, key);
		} else {
			// Found node to delete
			// 1. The node is leaf node
			if(root.left == null & root.right == null) {
				return null;
			}
			
			// 2. The node has 1 child
			else if(root.left == null) {
				return root.right;
			} else if(root.right == null) {
				return root.left;
			}
			
			// 3. The node has 2 children
			root.data = minValue(root.right);
			root.right = deleteData(root.right,root.data);
		}
		return root;
	}

	private int minValue(Node right) {
		int min = root.data;
		if(root.left!=null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	public boolean searchRecursive(int key) {
		return searchBSTRecursive(root,key);
		
	}

	private boolean searchBSTRecursive(Node root, int key) {
		if(root!=null) {
			if(root.data == key) {
				System.out.println(key + " data found");
				return true;
			}else if(key < root.data) {
				return searchBSTRecursive(root.left,key);
			}else {
				return searchBSTRecursive(root.right, key);
			}
		}
		System.out.println(key+ "data not found");
		return false;
	}

	public boolean searchNonRecursive(int key) {
		return searchBSTNonRecursive(root,key);
	}

	private boolean searchBSTNonRecursive(Node root, int key) {
		if(root!=null) {
			Node temp = root;
			while(temp!=null) {
				if(temp.data == key) {
					System.out.println(key+ " data found");
					return true;
				}else if(key<temp.data) {
					temp = temp.left;
				}else {
					temp = temp.right;
				}
			}
		}
		System.out.println(key + " not found");
		return false;
	}	
}