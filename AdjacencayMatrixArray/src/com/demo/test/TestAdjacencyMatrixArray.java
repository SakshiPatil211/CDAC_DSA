package com.demo.test;
import java.util.*;

public class TestAdjacencyMatrixArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int v = sc.nextInt();
		int[][] arr = new int[v][v];
		storeGraph(arr);
		displayGraph(arr);
	}

	private static void displayGraph(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

	private static void storeGraph(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.println("is there edge between " + i + "---->"+j);
				arr[i][j] = sc.nextInt();
			}
		}
	}

}
