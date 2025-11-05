package com.demo.sorting;

import java.util.Arrays;

public class CountingSort {

	public static int[] countingSortAscending(int[] arr) {
		int max = findMax(arr);
		//create a count array of size max+1
		int count[] = new int[max+1];
		//Initialize array to zero
		for(int i=0;i<count.length;i++) {
			count[i] = 0;
		}
		
		for(int i=0;i<arr.length;i++) {
			int pos =arr[i];
			count[pos]++;
		}
		System.out.println("Count array");
		System.out.println(Arrays.toString(count));
		
		//find cumulative sum
		for(int i=1;i<count.length;i++) {
			count[i] = count[i] + count[i-1];
		}
		System.out.println("Cummulative sum");
		System.out.println(Arrays.toString(count));
		
		//place number from array to output array
		int[] output = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int pos = arr[i];
			count[pos]--;
			int index = count[pos];
			output[index] = arr[i];
		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	private static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max< arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
}
