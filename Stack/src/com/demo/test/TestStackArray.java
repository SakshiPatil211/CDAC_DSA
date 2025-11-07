package com.demo.test;
import com.demo.stack.*;

public class TestStackArray {

	public static void main(String[] args) {
		MyStackArray stackArray = new MyStackArray();
		
		stackArray.push(1);
		stackArray.push(2);
		stackArray.push(3);
		stackArray.push(4);
		stackArray.push(5);
		stackArray.push(6);
		
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());		
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
	}

}
