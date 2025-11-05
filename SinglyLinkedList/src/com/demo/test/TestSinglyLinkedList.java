package com.demo.test;
import com.demo.singlyLinkedList.*;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.addNode(6);
		sll.addNode(8);
		sll.addNode(15);
		sll.addNode(1);
		sll.displayData();
		sll.addAtGivenPosition(3,12);
		System.out.println();
		sll.displayData();
		
		System.out.println();
		sll.addAtGivenValue(16,12);
		sll.displayData();

	}

}
