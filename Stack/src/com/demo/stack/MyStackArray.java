package com.demo.stack;

public class MyStackArray {
	private int top;
	private int[] arr;
	
	public MyStackArray() {
		arr = new int[5];
		top = -1;
	}
	
	public MyStackArray(int size) {
		arr = new int[size];
		top = -1;
	}
	
	//check stack is full
	public boolean isFull() {
		return top == arr.length-1;
	}
	
	//push element in the array
	public void push(int num) {
		if(!isFull()) {
			top++;
			arr[top] = num;
			System.out.println("pushed " + num);
		}else {
			System.out.println("Stack is full");
		}
	}
	
	//check stack is empty
	public boolean isEmpty() {
		return top == -1;
	}
	
	//pop element from the stack
	public int pop() {
		if(!isEmpty()) {
			int num = arr[top];
			top--;
			return num;
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
}
