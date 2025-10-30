package OneD_Array;

import java.util.Arrays;

public class My1DArray {
	private int arr[];
	private int count;

	public My1DArray() {
		count = 0;
		arr = new int[10];
	}

	public My1DArray(int[] arr,int count) {
		this.arr = arr;
		this.count = count;
	}
	
	public My1DArray(int size) {
		arr = new int[size];
		count = 0;
	}
	
	public int getCapacity() {
		return arr.length;
	}
	
	public int getSize() {
		return count;
	}
	
	//add at the end
	public boolean add(int x) {
		if(count<arr.length) {
			arr[count] = x;
			count++;
			return true;
		}
		return false;
	}

	//add at the given index
	public boolean add(int value, int index) {
		if(count<arr.length && index < count) {
			//shifting values one location on the right side and make place at index location
			for(int i=count ; i>=index ; i--) {
				arr[i] = arr[i-1];
			}
			arr[index] = value;
			count++;
			return true;
		}
		return false;
	}
	
	//search index by value 
	public int searchByValue(int value) {
		for(int i=0;i<count;i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	//delete by position
	public boolean deleteByPosition(int pos) {
		if(pos<count) {
			for(int i=pos;i<count-1;i++) {
				arr[i] = arr[i+1];
			}
			arr[count-1] = 0;
			count--;
			return true;
		}
		return false;
	}
	
	//delete first occurrence of the given value
	public boolean deleteByValue(int value) {
		int index = searchByValue(value);
		if(index != -1) {
			return deleteByPosition(index);
		}
		return false;
	}
	
	//rotate array 
	//[if flag = true then rotate by right, if flag = false then rotate by left]
	public void rotateArray(boolean flag, int rotate) {
		if(flag) {
			// rotate to right
			for(int i =0; i < rotate; i++) {
				int temp = arr[count-1];
				for(int j = count-1; j > 0; j--) {
					arr[j]=arr[j-1];
				}
				arr[0] = temp;
			}
		} else {
			// rotate by left
			for(int i = 0; i < rotate; i++) {
				int temp = arr[0];
				for(int j = 0; j < count - 1; j++) {
					arr[j] = arr[j+1];
				}
				arr[count-1] = temp;
			}
		}
	}
	
	
	//reverse array
	//true - reverse in-place
	//false - reverse in another array make 1st array as it is
	public int[] reverseArray(boolean flag) {
		if(flag) {
			int start = 0;
			int end = count-1;
			while(start<end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			return arr;
		}else {
			int[] temp1 = new int[count];
			int j= 0;
			for(int i=count-1 ; i>=0 ; i--) {
				temp1[j] = arr[i];
				j++;
			}
			return temp1;
		}
	}
	
	//replace index with value and value with index
	public int[] exchangeIndexValue() {
		//find max
		int max = findMax(arr);
		
		//create new array and store -1
		int[] arr1 = new int[max+1];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = -1;
		}
		
		//exchange index with value and vice versa
		for(int i=0; i<count; i++) {
			int index = arr[i];
			int value = i;
			arr1[index] = value;
		}
		return arr1;
	}
	
	// find max
	private int findMax(int[] arr2) {
		int max = arr[0];
		for(int i=1;i<count;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	// find sum of elements
	public int findSum() {
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	

	@Override
	public String toString() {
		return "My1DArray [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}
	
}
