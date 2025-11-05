package com.demo.test;

import com.demo.sorting.QuickSort;

public class TestQuickSort {
	public static void main(String[] args) {
		int[] arr= {21,2,5,1,7,8,10,3};
		
		QuickSort.quickSort(arr, 0, arr.length-1);
		
	}
}
