package com.demo.test;
import com.demo.doublyCircularLL.*;

public class TestDoublyCircularLL {

	public static void main(String[] args) {
		DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
		
		dcll.addNode(1);
		dcll.addNode(15);
		dcll.addNode(5);
		dcll.addNode(8);
		dcll.addNode(10);
		dcll.addNode(25);
		dcll.displayData();
		
//		//add by position
//		dcll.addByPosition(1,2); //first
//		dcll.addByPosition(4,2); //in-between
//		dcll.addByPosition(6,2); //last
		dcll.addByPosition(7,2); // last
//		dcll.addByPosition(8,2); //position not found
		dcll.displayData();
//		
//		//add by value
//		dcll.addByValue(1,35); //first
//		dcll.addByValue(5,35); // in-between
//		dcll.addByValue(25,35); // last value
//		dcll.addByValue(2,35); // value not present
//		dcll.displayData();
//		
//		//delete by position
//		dcll.deleteByPosition(1); //first
//		dcll.deleteByPosition(5); //in-between
//		dcll.deleteByPosition(6); // last
//		dcll.deleteByPosition(35); //position not found
//		dcll.displayData();
//		
//		//delete by value
//		dcll.deleteByValue(1); //first value
//		dcll.deleteByValue(8); // in-between
//		dcll.deleteByValue(25); //last
//		dcll.deleteByValue(20); // not found
//		dcll.displayData();
		
		dcll.reverseDCLL();
	}

}
