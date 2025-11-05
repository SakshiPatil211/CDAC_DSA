package com.demo.test;

import com.demo.sorting.SelectionSort;

public class TestSelectionSort {
	public static void main(String[] args) {
		int[] arr= {21,2,5,1,7,8,10,3};
		
		SelectionSort.selectionSortAscending(arr);
		SelectionSort.selectionSortDescending(arr);
	}
}
