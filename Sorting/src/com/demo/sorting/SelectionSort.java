package com.demo.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	// Find Nth min
	private static int findNthMin(int[] arr, int start) {
		int minpos = start;
		int min = arr[minpos];
		for(int i = start; i < arr.length;i++) {
			if(min > arr[i]) {
				minpos = i;
				min = arr[i];
			}
		}
		return minpos;
	}
	
	// Sort by Ascending Order
	public static void selectionSortAscending(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			// Find the position of ith minimum number
			int minpos = findNthMin(arr, i);
			// Swap minimum value with ith position
			int temp = arr[i];
			arr[i] = arr[minpos];
			arr[minpos] = temp;
			System.out.println(Arrays.toString(arr));
			
		}
	}
	
	// Find Nth max
	private static int findNthMax(int[] arr, int start) {
		int maxpos = start;
		int max = arr[start];
		for(int i = start; i < arr.length; i++) {
			if(max < arr[i]) {
				maxpos = i;
				max = arr[i];
			}
		}
		return maxpos;
	}
	
	// Sort by Descending Order
	public static void selectionSortDescending(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int maxpos = findNthMax(arr, i);
			int temp = arr[i];
			arr[i] = arr[maxpos];
			arr[maxpos] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
	
}
