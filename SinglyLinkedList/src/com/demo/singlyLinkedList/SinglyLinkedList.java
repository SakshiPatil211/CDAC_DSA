package com.demo.singlyLinkedList;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public SinglyLinkedList(){
		head = null;
	}

	//add node at last
	public void addNode(int data) {
		Node newNode = new Node(data);
		//add at head
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			//will keep on moving temp on right, till it reaches to last node
			while(temp.next !=null) {
				temp = temp.next;
			}
			//add node at the end
			temp.next = newNode;
		}
		
	}
	
	//display data of linked list
	public void displayData() {
		if(head == null) {
			System.out.println("List is empty");
		}else {
			for(Node temp = head; temp!=null; temp= temp.next) {
				System.out.print(temp.data+ " ---> ");
			}
		}
			
	}

	//add at give position
	public void addAtGivenPosition(int pos, int data) {
		Node newNode = new Node(data);
		
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
		}else {
			Node temp = head;
			for(int i=0; i<pos-2 && temp!=null; i++) {
				temp = temp.next;
			}
			
			if(temp!=null) {
				newNode.next = temp.next;
				temp.next = newNode;
			}else {
				System.out.println("given position is "+ pos + " beyound the length");
			}
		}
		
	}
	
	// add value after given num 
	public void addAtGivenValue(int value,int num) {
		Node newNode=new Node(value);
		Node temp=head;
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
		}
		//if num found
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
			
		}else {
			System.out.println(num+" Not Found");
		}
		
	}
}
