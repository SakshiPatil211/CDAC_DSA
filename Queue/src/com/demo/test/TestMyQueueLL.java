package com.demo.test;
import com.demo.queue.*;

public class TestMyQueueLL {

	public static void main(String[] args) {
		MyQueueLL qll = new MyQueueLL();
		
		
		qll.enQueue(1);
		qll.enQueue(2);
		qll.enQueue(3);
		qll.enQueue(4);
		qll.enQueue(5);
		qll.enQueue(6);
		
		
		System.out.println(qll.deQueue());
		System.out.println(qll.deQueue());
		System.out.println(qll.deQueue());
		System.out.println(qll.deQueue());
		System.out.println(qll.deQueue());
		System.out.println(qll.deQueue());
		System.out.println(qll.deQueue());
	}

}
