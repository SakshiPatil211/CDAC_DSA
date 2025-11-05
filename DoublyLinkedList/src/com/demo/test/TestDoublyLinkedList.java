package com.demo.test;

import com.demo.doublyLinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.addNode(5);
		dll.addNode(1);
		dll.addNode(10);
		dll.addNode(4);
		dll.addNode(15);
		dll.addNode(9);
		dll.addNode(6);
		dll.displayData();
		System.out.println();
		
		dll.addAtGivenPosition(1,8); //first
		dll.addAtGivenPosition(4,8); //in-between
		dll.addAtGivenPosition(7,8);//last add
		dll.addAtGivenPosition(8, 10); //position not found
		dll.displayData();
		
		dll.addByValue(5,2); //first value
		dll.addByValue(4,2); //in-between
		dll.addByValue(6,2); //last add
		dll.addByValue(25, 10); //value not present
		dll.displayData();
		System.out.println();
		
		dll.deleteByValue(5); //first value
		dll.deleteByValue(4); //in-between
		dll.deleteByValue(6); // last delete
		dll.deleteByValue(25); // value not present
		dll.displayData();
		System.out.println();
		
		dll.deleteByPosition(1); //first position
		dll.deleteByPosition(4); //in-between
		dll.deleteByPosition(7); //last position
		dll.deleteByPosition(8); //position not found
		dll.displayData();
		System.out.println();
	}

}
