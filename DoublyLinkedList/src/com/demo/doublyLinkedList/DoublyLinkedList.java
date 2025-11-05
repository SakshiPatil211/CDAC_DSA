package com.demo.doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}
	
	public DoublyLinkedList() {
		head = null;
	}
	
	//add at the end
	public void addNode(int value) {
		Node temp = head;
		Node newnode = new Node(value);
		//if list is empty
		if(head == null) {
			head = newnode;
		}else {
			//if list contain 1 node
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.prev = temp;
		}
	}
	
	//display data
	public void displayData() {
		for(Node temp = head; temp!=null; temp = temp.next) {
			System.out.print(temp.data + " ---> ");
		}
		System.out.println("null");
	}

	//add at given position
	public void addAtGivenPosition(int pos, int value) {
		Node temp = head;
		Node newnode = new Node(value);
		//if position is start
		if(pos == 1) {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}else {
			//traverse till pos-2
			for(int i=0; i<pos-2 && temp!=null; i++) {
				temp= temp.next;
			}
			//add in-between or at last
			if(temp!=null) {
				newnode.prev = temp;
				newnode.next = temp.next;
				temp.next.prev = newnode;
				temp.next = newnode;
			}else {
				System.out.println(pos + " beyound limit");
			}
		}
	}
	
	//add at give value
	public void addByValue(int value, int num) {
		Node temp = head;
		Node newnode = new Node(num);
		
		//if value is present at start
		if(head.data == value) {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		} else {
			//traverse till last or till data found
			while(temp != null && temp.data != value) {
				temp = temp.next;
			}
			////if value is present in-between or at last
			if(temp != null) {
				newnode.prev = temp.prev;
				newnode.next = temp;
				temp.prev.next = newnode;
				temp.prev = newnode;
			} else {
				System.out.println("Value not found!");
			}
		}
	}

	// delete by value
	public void deleteByValue(int value) {
		Node temp = head;
		//value found at start
		if(head.data == value) {
			head.next.prev = null;
			head = head.next;
		} else {
			//traverse till end or till the data found
			while(temp != null && temp.data != value) {
				temp = temp.next;
			}
			//delete in-between or delete from last 
			if(temp != null) {
				temp.prev.next = temp.next;
				//in-between
				if(temp.next != null) {
					temp.next.prev = temp.prev;
				}
				temp.next = null;
				temp.prev = null;
			}
		}
	}

	// Delete by position
	public void deleteByPosition(int pos) {
		Node temp = head;
		//position is start
		if(pos == 1) {
			head.next.prev = null;
			head = head.next;
			temp.next = null;
		} else {
			//traverse till end or till the position found
			for(int i = 0; i < pos-1 && temp != null; i++) {
				temp = temp.next;
			}
			//delete in-between or delete from last 
			if(temp != null) {
				temp.prev.next = temp.next;
				//in-between
				if(temp.next != null) {
					temp.next.prev = temp.prev;
				}
				temp.next = null;
				temp.prev = null;
			} else {
				System.out.println("Position not found!");
			}
		}
	}
	
	
}
