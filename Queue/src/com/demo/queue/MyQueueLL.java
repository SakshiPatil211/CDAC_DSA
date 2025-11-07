package com.demo.queue;

public class MyQueueLL {
	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public MyQueueLL(){
		front = rear = null;
	}
	
	//check queue is empty
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	//add node to the queue
	public void enQueue(int value) {
		Node newNode = new Node(value);
		
		if(isEmpty()) {
			front = rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("added num "+ value);
	}
	
	//delete node from the queue
	public int deQueue() {
		if(!isEmpty()) {
			Node temp = front;
			front = front.next;
			//if queue has only one node
			if(front == null) {
				rear = null;
			}
			temp.next = null;
			return temp.data;
		}else {
			System.out.println("queue is empty");
			return -1;
		}
	}

}
