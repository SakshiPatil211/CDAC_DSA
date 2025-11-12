package com.demo.test;
import com.demo.array1D.*;
import java.util.*;

public class TestArray1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array1D a = new Array1D();
//		a.acceptData();
//		a.displayData();
		
		int choice =0;
		do {
			System.out.println("\n1. Find addition of digits of all every individual number in the array \n");
			System.out.println("\n2. Find factorial of only prime  numbers in the array");
			System.out.println("\n3. Find maximum prime number in the array ");
			System.out.println("\n4.display ,if no is prime and <5 then copy the reverse of the number, otherwise copy number as it is");
//			System.out.println("\n5. Create a array of size 20, accept string from user and store it in the array, in such a \r\n"
//					+ "fashion that all the string whose 2nd character is same should be together in the array \r\n"
//					+ "In the following array if user adds bat, then this string should get added after xamp, if \r\n"
//					+ "user adds linux, then add at the end. \n");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1->{
					//1. Find addition of digits of all every individual number in the array 
					int[] arr = a.additionofDigits();
					System.out.println("Addition of digits of all every individual number in the array");
					display(arr);
				}
				
				case 2->{
					//2. Find factorial of only prime  numbers in the array 
					int[] arr1 = a.findFactorialOfPrime();
					System.out.println("factorial of only prime  numbers in the array ");
					display(arr1);
				}
				
				case 3->{
					//3. Find maximum prime number in the array 
					int max = a.findMaxPrime();
					System.out.println(" maximum prime number in the array " + max);
				}
				
				case 4->{
					//4. display ,if no is prime and <5 then copy the reverse of the number, otherwise copy number as it is
					int[] arr = a.findReverseOfPrime();
					display(arr);
				}
				
				case 5->{
					Array1DString s = new Array1DString();
					s.acceptData();
					s.displayData();
				}
			}
		}while(choice!=6);
	}

	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

}
