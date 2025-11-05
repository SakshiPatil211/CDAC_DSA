package com.demo.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSortAscending(int[] arr, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			//left tree
			mergeSortAscending(arr,start,mid);
			//right tree
			mergeSortAscending(arr,mid+1,end);
			//merge arrays
			merge(arr,start,mid,end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		//length of the left array
		int l1 = mid-start+1;
		//length of the right array
		int l2 = end-mid;
		int[] leftArray = new int[l1];
		int[] rightArray = new int[l2];
		//copy arrays;
		for(int i=0;i<l1;i++) {
			leftArray[i] = arr[start+i];
		}
		for(int i=0;i<l2;i++) {
			rightArray[i] = arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k = start;
		while(i<l1 && j<l2) {
			if(leftArray[i] < rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
				k++;
			}else{
				arr[k] = rightArray[j];
				j++;
				k++;
			}
		}
		
		//copy remaining part of the left array
		while(i<l1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		//copy remaining part of the right array
		while(j<l2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		System.out.println(start + mid + end);
		System.out.println(Arrays.toString(leftArray));
		System.out.println(Arrays.toString(rightArray));
	}
	
}
