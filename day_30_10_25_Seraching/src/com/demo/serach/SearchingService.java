package com.demo.serach;

public class SearchingService {

	//linear search
	public static int sequentialSearch(int[] arr, int value) {
		for(int i=0;i<arr.length;i++) {
			if(value == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	//binary search on number iterative
	public static int binarySerachNonRecursive(int[] arr, int value) {
		
		int low = 0;
		int high = arr.length-1;
		int cnt = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			cnt++;
			
			if(arr[mid] == value) {
				System.out.println("Comparison are " + cnt);
				return mid;
			}else if(value < arr[mid]) {
				high = mid-1;
			}else if(value > arr[mid]) {
				low = mid+1;
			}
		}
		
		System.out.println("Comparison are " + cnt);
		return -1;
	}

	//binary search on number recursive
	public static int binarySerachRecursive(int[] arr1, int value, int low, int high) {
		System.out.println("Binary serach called " + low + " " + high);
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(value == arr1[mid]) {
				return mid;
			}else if(value < arr1[mid]) {
				return binarySerachRecursive(arr1,value,low,mid-1);
			}else if(value > arr1[mid]) {
				return binarySerachRecursive(arr1,value,mid+1,high);
			}
		}
		return -1;
	}

	//binary search on string recursive
	public static int binarySerachOnString(String[] str, String search, int low, int high) {
		System.out.println("Binary search called " + low + " " + high);
		while(low > high) {
			return -1;
		}
		int mid = (low+high)/2;
		int pos = search.compareTo(str[mid]);
		if(pos == 0) {
			return mid;
		}else if(pos<0) {
			return binarySerachOnString(str,search,low,mid-1);
		}else if(pos>0) {
			return binarySerachOnString(str,search,mid+1, high);
		}
	}

	//binary search on string iterative
	public static int binarySerachOnStringIterative(String[] str, String search) {
		int low - 0;
		int high = str.length;
		
		while(low<=high) {
			int mid = (low+high)/2;
			int pos = search.compareTo(str[mid]);
			if(pos == 0) {
				return mid;
			}else if(pos<0) {
				high = mid-1;
			}else if(pos>0) {
				low = mid+1;
			}
		}

		return -1;
	}
	

}
