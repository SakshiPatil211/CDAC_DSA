package com.demo.stack;

public class MyGenericStackList<T> {
	Node top;
	
	class Node{
		T data;
		Node next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public MyGenericStackList(){
		top = null;
	}
	
	//check stack is empty
	public boolean isEmpty() {
		return top == null;
	}
	
	//push Node to the stack
	public void push(T value) {
		Node newNode = new Node(value);
		
		if(!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("pushed " + value);
	}
	
	//pop Node from the stack
	public T pop() {
		if(!isEmpty()) {
			Node temp = top;
			top = top.next;
			temp.next = null;
			return temp.data;
		}else {
			System.out.println("stack is empty");
			return null;
		}
	}
}
