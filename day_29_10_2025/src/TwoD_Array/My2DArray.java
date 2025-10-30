package TwoD_Array;
import java.util.*;

public class My2DArray {
	private int[][] arr;

	public My2DArray() {
		arr = new int[3][3];
	}

	public My2DArray(int row,int cols) {
		arr = new int[row][cols];
	}
	
	
	//accept data
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.println("Enter data for " + i + j );
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	//display data
	public void displayData() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				 System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	//find sum row-wise
	public int[] findSumRowwise() {
		int temp[] = new int[arr.length];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum= sum + arr[i][j];
			}
			temp[k] = sum;
			k++;
		}
		return temp;
	}
	
	//find sum column-wise
	public int[] findSumColumnwise() {
		int temp[] = new int[arr[0].length];
		int k=0;
		for(int i=0; i<arr[0].length; i++) {
			int sum = 0;
			for(int j=0; j<arr.length; j++) {
				sum= sum + arr[j][i];
			}
			temp[k] = sum;
			k++;
		}
		return temp;
	}

	@Override
	public String toString() {
		return "My2DArray [arr=" + Arrays.toString(arr) + "]";
	}
	
}
