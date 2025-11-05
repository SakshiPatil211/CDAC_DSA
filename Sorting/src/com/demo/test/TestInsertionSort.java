package com.demo.test;

import com.demo.sorting.InsertionSort;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr= {21,2,5,1,7,8,10,3};
		
		InsertionSort.insertionSortAscending(arr);
		InsertionSort.insertionSortDescending(arr);
	}

}
