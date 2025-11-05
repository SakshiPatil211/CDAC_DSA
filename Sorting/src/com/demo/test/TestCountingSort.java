package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountingSort;

public class TestCountingSort {

	public static void main(String[] args) {
		int[] arr= {5,3,7,2,5,9,5,4,3};
		int[] output = CountingSort.countingSortAscending(arr);
		System.out.println(Arrays.toString(output));
	}

}
