package com.demo.stack;

public class MyStackListGeneric<T> {
	Node top;
	class Node{
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
			next = null;
		}
	}
	
	public MyStackListGeneric(){
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(T data) {
		Node newNode = new Node(data);
		if(!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("pushed"+data);
	}
	
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
