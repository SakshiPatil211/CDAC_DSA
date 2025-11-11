package com.demo.LinkedList;

public class MyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	MyLinkedList(){
		head = null;
	}
	
	//add node
	public void addNode(int num) {
		Node newNode = new Node(num);
		if(head != null) {
			newNode.next = head;
		}
		head = newNode;
	}
	
	//serch node
	public boolean search(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp = head;
			while(temp!=null && temp.data != val) {
				temp = temp.next;
			}
			if(temp.data == val) {
				return true;
			}
			return false;
		}
	}
	
	//display linked list
	public void displayList() {
		if(head == null) {
			System.out.println("empty");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data + "--->");
				temp= temp.next;
			}
			System.out.println("null");
			System.out.println();
		}
	}
}
