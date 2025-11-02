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
	
	//addition of two matrix using object one as this and another as explicit
	public int[][] add2DArray(My2DArray obj){
		if(this.arr.length == obj.arr.length && this.arr[0].length == obj.arr[0].length) {
			int temp[][] = new int[this.arr.length][this.arr[0].length];
			
			for(int i=0;i<this.arr.length;i++) {
				for(int j=0;j<this.arr[i].length;j++) {
					temp[i][j] = this.arr[i][j] + obj.arr[i][j];
				}
			}
			return temp;
		}
		return null;
		
	}
	
	//subtraction of two matrix using object one as this and another as explicit
	public int[][] subtract2DArray(My2DArray obj1) {
		if(this.arr.length == obj1.arr.length && this.arr[0].length == obj1.arr[0].length) {
			int temp[][] = new int[this.arr.length][this.arr[0].length];
			
			for(int i=0;i<this.arr.length;i++) {
				for(int j=0;j<this.arr[i].length;j++) {
					temp[i][j] = this.arr[i][j] - obj1.arr[i][j];
				}
			}
			return temp;
		}
		return null;
	}
	
	//Rotate Array row-wise
	//true = upward
	//false = down-word
	public void rowRotation(boolean flag, int rotate) {
		//int[][] temp = new int[arr.length][arr[0].length];
		
		if(flag) {
			//rotate upward
			for(int j=0; j<rotate; j++) {
				//copy first row in the new array
				int temp1[] = arr[0];
			
				//copy up-word from 2nd position
				for(int i=0; i<arr.length-1; i++) {
					arr[i] = arr[i+1];
				}
			
				arr[arr.length-1] = temp1;
			}
		}else {
			//rotate down-ward
			for(int k=0; k<rotate ;k++) {
				//copy last row in the new array
				int temp1[] = arr[arr.length-1];
			
				//copy up-word from 2nd position
				for(int i=arr.length-2; i>=0 ; i--) {
					arr[i+1] = arr[i];
				}
			
				arr[0] = temp1;
			}
	
		}
	}
	
	//rotate array column-wise
	//true- right
	//false = left
	public void columnRotation(boolean flag, int rotate) {
		if(flag) {
			//rotate by right
			for(int i=0;i<rotate;i++) {
				int[] temp = new int[arr.length];
				
				//copy last column new array
				for(int j=0; j<temp.length; j++) {
					temp[j] = arr[j][arr[0].length-1]; 
				}
				
				//shift column right
				for(int k=0; k<arr.length; k++) {
					for(int j=arr[0].length-2; j>=0; j--) {
						arr[k][j+1] = arr[k][j];
					}
				}
				
				//copy temp into first column
				for(int j=0;j<arr.length;j++) {
					arr[j][0] = temp[j];
				}
				
			}
		}else {
			//rotate by left
			for(int i=0;i<rotate;i++) {
				int[] temp = new int[arr.length];
				
				//copy first column new array
				for(int j=0; j<arr.length; j++) {
					temp[j] = arr[j][0]; 
				}
				
				//shift column left
				for(int k=0; k<arr.length; k++) {
					for(int j=1; j<arr[0].length; j++) {
						arr[k][j-1] = arr[k][j];
					}
				}
				
				//copy temp into last column
				for(int j=0;j<arr.length;j++) {
					arr[j][arr[0].length-1] = temp[j];
				}
			}
		}
		
	}
	
	//transpose of matrix
	public int[][] transposeMAtrix() {
		int[][] temp = new int[arr[0].length][arr.length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j] = arr[j][i];
			}
		}
		return temp;
	}
	
	//Symmetric matrix
	public boolean isSymmetric() {
		if(arr.length == arr[0].length) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j] != arr[j][i]) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	//identity
	public boolean isIdentity() {
		if(arr.length == arr[0].length) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j] != 1 && i==j) {
						return false;
					}
					if(arr[i][j] != 0 && i!=j) {
						return false;
					}
				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "My2DArray [arr=" + Arrays.toString(arr) + "]";
	}
	
}
