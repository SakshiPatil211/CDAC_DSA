package com.demo.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSortAscending(int[] arr) {
		for(int i = 1; i < arr.length;i++) {
			int j = i-1;
			// Copy the element to be sorted
			int key = arr[i];
			// shift elements on the right, till the value at jth location is greater than key j >= 0
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			// Place the key in the sorted array
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void insertionSortDescending(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int j = i-1;
			// Copy the elements to be sorted
			int key = arr[i];
			// Shift the elements
			while(j >=0 && arr[j] < key) {
				arr[j+1] = arr[j];
				j--;
			}
			// Place the key in sorted array
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
		}
	}
}
