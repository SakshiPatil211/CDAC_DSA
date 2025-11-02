package com.demo.test;

import com.demo.serach.SearchingService;

public class TestSerach {

	//Linear search
	public static void main(String[] args) {
		//Sequential search
//		int[] arr= {10,5,4,7,8,3,2,15};
//		
//		int pos = SearchingService.sequentialSearch(arr,8);
//		if(pos != -1) {
//			System.out.println(" elemnt found at "+ pos);
//		}else {
//			System.out.println("element not found");
//		}
//		
//		//Binary search 
//		int[] arr1= {12,13,16,23,27,45,56,58,62,65,70};
//		
//		//non- recursive
//		pos = SearchingService.binarySerachNonRecursive(arr1,70);
//		if(pos != -1) {
//			System.out.println(" elemnt found at "+ pos);
//		}else {
//			System.out.println("element not found");
//		}
//		
//		//recursive
//		pos = SearchingService.binarySerachRecursive(arr1,70,0,arr1.length-1);
//		if(pos != -1) {
//			System.out.println(" elemnt found at "+ pos);
//		}else {
//			System.out.println("element not found");
//		}
		
		String[] str = {"Apple","Bananna","Cat","Dog","Egg","Fish","Grapes"};
		System.out.println(str.length);
		int pos = SearchingService.binarySerachOnString(str,"Apple",0,str.length-1);
		if(pos != -1) {
			System.out.println(" elemnt found at "+ pos);
		}else {
			System.out.println("element not found");
		}
	}
}
