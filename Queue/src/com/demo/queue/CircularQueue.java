package com.demo.queue;

public class CircularQueue {
	int arr[];
	int rear;
	int front;
	
	public CircularQueue() {
		arr = new int[10];
		rear = -1;
		front = -1;
	}
	
	public CircularQueue(int size) {
		arr = new int[size];
		rear = front = -1;
	}
	
	public boolean isEmpty() {
		if(front == -1) {
			System.out.println("queue is empty");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(front == 0 && rear == arr.length-1) {
			return true;
		}else if(front == rear+1) {
			return true;
		}
		return false;
	}
	
	public void enQueue(int value) {
		if(!isFull()) {
			if(front == -1) {
				front = 0;
			}
			rear = rear + 1 %  arr.length;
			arr[rear] = value;
			System.out.println("added " + value);
		}
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			int n = arr[front];
			if(front == rear) {
				front = rear = -1;
			}else {
				front = front +1 % arr.length;
			}
			return n;
		}
		return -1;
	}
}
