package com.demo.stack;

public class MyStackLinkedList {
	Node top;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public MyStackLinkedList(){
		top = null;
	}
	
	//check stack is empty
	public boolean isEmpty() {
		return top == null;
	}
	
	//push Node to the stack
	public void push(int value) {
		Node newNode = new Node(value);
		
		if(!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("pushed " + value);
	}
	
	//pop Node from the stack
	public int pop() {
		if(!isEmpty()) {
			Node temp = top;
			top = top.next;
			temp.next = null;
			return temp.data;
		}else {
			System.out.println("stack is empty");
			return -1;
		}
	}
}
