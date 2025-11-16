package com.demo.doublyCircularLL;

public class DoublyCircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
	public DoublyCircularLinkedList() {
		head = null;
	}
	
	//add node at last
	public void addNode(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
			newNode.prev = head;
			newNode.next = head;
		}else {
			Node temp = head;
			while(temp.next!=head) {
				temp = temp.next;
			}
			//Node temp = head.prev;
			newNode.next = temp.next;
			head.prev = newNode;
			newNode.prev = temp;
			temp.next = newNode;
		}
	}

	//display data
	public void displayData() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is empty");
		}else {
			while(temp.next!= head) {
				System.out.print(temp.data+ "--->");
				temp = temp.next;
			}
			System.out.print(temp.data+ "---> head");
			System.out.println();

			/*
			Node temp = head;
			do{
				System.out.print(temp.data+ "--->");
				temp = temp.next;
			}while(temp != head);
			*/
		}
	}

	//add by position
	public void addByPosition(int pos, int value) {
		Node newNode = new Node(value);
		Node temp = head;

		if(head == null){
			System.out.println("List is empty--->");
		}else{
			if(pos == 1) {
				Node temp = head.prev;
				temp.next = newNode;
				newNode.prev = temp;
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
			}else {
				Node temp = head;
				int i=0;
				for(; i<pos-2 && temp.next!=head; i++) {
					temp = temp.next;
				}
				if(i==pos-2) {
					newNode.prev = temp;
					newNode.next = temp.next;
					temp.next = newNode;
					newNode.next.prev = newNode;                                           
				}else {
					System.out.println(pos + "position not found");
				}
			}
		}
	}

	//add by value
	public void addByValue(int value, int num) {
		Node newNode = new Node(num);
		Node temp = head;
		
		while(temp.data != value && temp.next != head) {
			temp = temp.next;
		}
		if(temp.data == value) {
			newNode.prev = temp;
			newNode.next = temp.next;
			temp.next.prev = newNode; //temp.next = newNode;
			temp.next = newNode; //newNode.next.prev = newNode;
		}else {
			System.out.println("Not found");
		}
	}
	
	//delete By position
	public void deleteByPosition(int pos) {
		Node temp = head;
		
		if(head == null) {
			System.out.println("List is empty");
		}else {
			Node tail = head.prev;
			if(pos == 1) {
				// Node tail = head;
				// while(tail.next!=head) {
				// 	tail = tail.next;
				// }
				if(tail == head) {
					head.next = null;
					head.prev = null;
					head = null;
					
				}else {
					tail.next = head.next;
					head.next.prev = tail;
					head =head.next;
					head.next = null;
					head.prev = null;
				}
			}else {
				int i=0;
				for(;i<pos-1 && temp.next!=head; i++) {
					temp = temp.next;
				}
				if(i== pos-1) {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
					temp.next = null;
					temp.prev = null;
				}else {
					System.out.println(pos + " position not found");
				}
				
			}
		}
	}

	//delete by value
	public void deleteByValue(int value) {
		if(head == null) {
			System.out.println("list is empty");
		}else {
			Node tail = head.prev;
			if(head.data == value) {
				// while(temp.next != head) {
				// 	temp = temp.next;
				// }
				if(tail == head){
					head = null;
				}else{
					tail.next = head.next;
					head.next.prev = tail;
					head = tail.next;
					head.next = null;
					head.prev = null;
				}
			}else {
				Node temp = head;
				while(temp.data!=value && temp.next!=head) {
					temp = temp.next;
				}
				if(temp.data == value) {
					temp.next.prev = temp.prev;
					temp.prev.next = temp.next;
					temp.next = null;
					temp.prev = null;
				}else {
					System.out.println("value not found");
				}
			}
		}
		
	}

	//reverse ll
	public void reverseDCLL() {
	    Node temp = head;
		do{
			System.out.print(temp.prev.data +" ");
			temp = temp.prev;
		}while(temp!=head);
	}
}
