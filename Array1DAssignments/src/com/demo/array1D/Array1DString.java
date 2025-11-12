package com.demo.array1D;
import java.util.*;

public class Array1DString {
	int size;
	String[] arr;
	
	public Array1DString() {
		this.arr = new String[5];
	}
	
	public Array1DString(int size) {
		this.size = size;
		this.arr = new String[size];
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the string");
			arr[i] = sc.next();
		}
	}

	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();	
	}
	
	
	
}
