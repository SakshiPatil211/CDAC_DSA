package com.demo.test;

import java.util.stream.IntStream;

import com.demo.sorting.BubbleSort;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr= {21,2,5,1,7,8,10,3};
		
		BubbleSort.bubbleSortSimple(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+" "));
		
		BubbleSort.bubbleSortOptimized(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+" "));
		
		BubbleSort.bubbleSortOptimizedDescending(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+" "));
	}

}
