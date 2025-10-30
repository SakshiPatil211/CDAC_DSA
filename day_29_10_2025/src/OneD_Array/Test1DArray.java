package OneD_Array;
import java.util.*;
import java.util.stream.IntStream;

public class Test1DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		My1DArray obj = new My1DArray();
		System.out.println("Capacity: " + obj.getCapacity());
		
//		boolean status = obj.add(x);
//		if(status) {
//			System.out.println("addded");
//		}else {
//			System.out.println("array is full");
//		}
		
		obj.add(5);
		obj.add(10);
		obj.add(2);
		obj.add(4);
		obj.add(9);
		obj.add(6);
		obj.add(2);
		System.out.println(obj);
		obj.add(7,2);
		System.out.println(obj);
		System.out.println("index of 10 is : " + obj.searchByValue(10));
		obj.deleteByPosition(2);
		System.out.println(obj);
		obj.deleteByValue(2);
		System.out.println(obj);
		obj.rotateArray(false, 2);
		System.out.println("Rotate by left " + obj);
		obj.rotateArray(true, 2);
		System.out.println("Rotate by right " + obj);
		obj.reverseArray(true);
		System.out.println("Reversed array in-place " +obj);
		int[] arr = obj.reverseArray(false);
		System.out.println("Original array " + obj);
		System.out.println("Reversed array");
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		//OR
		//IntStream.of(arr).forEach(e->System.out.print(e + "\t" ));
		
		int[] arr1 = obj.exchangeIndexValue();
		System.out.println("exchange index value array");
		for(int i : arr1) {
			System.out.print(i+ " ");
		}
		
		System.out.println("\nSum : " + obj.findSum());

	}

}
