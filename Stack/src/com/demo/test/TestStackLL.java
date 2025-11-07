package com.demo.test;
import com.demo.stack.*;

public class TestStackLL {

	public static void main(String[] args) {
		MyStackLinkedList stckll = new MyStackLinkedList();
		
		stckll.push(1);
		stckll.push(2);
		stckll.push(3);
		stckll.push(4);
		stckll.push(5);
		stckll.push(6);
		stckll.push(7);
		
		System.out.println(stckll.pop());
		System.out.println(stckll.pop());
		System.out.println(stckll.pop());
		System.out.println(stckll.pop());
		System.out.println(stckll.pop());
		System.out.println(stckll.pop());
		System.out.println(stckll.pop());
		System.out.println(stckll.pop());
	}

}
