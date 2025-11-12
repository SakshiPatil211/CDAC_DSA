package com.demo.array1D;
import java.util.*;

public class Array1D {
	private int size;
	private int[] arr;
	
	public Array1D() {
		this.arr = new int[5];
	}
	
	public Array1D(int size) {
		this.size = size;
		this.arr = new int[size];
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the data");
			arr[i] = sc.nextInt();
		}
	}

	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//1. Find addition of digits of all every individual number in the array 
	public int[] additionofDigits() {
		int[] temp = new int[arr.length];
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			while(arr[i]!=0) {
				int rem = arr[i]%10;
				sum = sum + rem;
				arr[i] = arr[i]/10;
			}
			temp[k] = sum;
			k++;
		}
		
		return temp;
	}
	
	//2. Find factorial of only prime  numbers in the array 
	public int[] findFactorialOfPrime() {
		int temp[] = new int[arr.length];
		int k=0;
		int fact =0;
		
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				fact = factorial(arr[i]);
				temp[k] = fact;
				k++;
			}
		}
		return temp;
	}

	//check prime
	private boolean isPrime(int num) {
		if(num== 1) {
			return false;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}	
			}
		}
		return true;
	}
	
	//factorial
	private int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact* i;
		}
		return fact;
	}

	//3. Find maximum prime number in the array 
	public int findMaxPrime() {
		int[] temp = new int[arr.length];
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				temp[k] = arr[i];
				k++;
			}
		}
		int max= temp[0];
		for(int i=1;i<temp.length;i++) {
			if(max<temp[i]) {
				max = temp[i];
			}
		}
		return max;
	}
	
	//4. Create a copy of array, but while copying data into another array, if the number is 
	//prime and <5 then copy the reverse of the number, otherwise copy number as it is
	public int[] findReverseOfPrime() {
		int temp[] = new int[arr.length];
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i]) && arr[i]<5) {
				temp[k] = reverse(arr[i]);
				k++;
			}else {
				temp[k] = arr[i];
				k++;
			}
		}
		return temp;
	}

	private int reverse(int num) {
		int rev =0;
		int rem =0;
		while(num!=0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		return rev;
	}

	
}
