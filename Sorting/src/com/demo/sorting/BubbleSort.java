package com.demo.sorting;

import java.util.Arrays;

public class BubbleSort {

	//simple bubble sort
	public static void bubbleSortSimple(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void bubbleSortOptimized(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void bubbleSortOptimizedDescending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]<arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
		}	
	}

}
