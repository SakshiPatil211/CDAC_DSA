package TwoD_Array;

public class Test2DArray {

	public static void main(String[] args) {
		My2DArray obj = new My2DArray();
		My2DArray obj1 = new My2DArray();
		
		//obj1.acceptData();
		obj.acceptData();
		obj.displayData();
		//obj1.displayData();
		
		//row-wise sum
//		int sumRow[] = obj.findSumRowwise();
//		for(int i : sumRow) {
//			System.out.print(i + " ");
//		}
		
		//sum column-wise
//		System.out.println();
//		int sumColumn[] = obj.findSumColumnwise();
//		for(int i : sumColumn) {
//			System.out.print(i + " ");
//		}
		
		//addition of two 2D array
//		int temp[][] = obj.add2DArray(obj1);
//		if(temp!=null) {
//			System.out.println("Addition of two matrix");
//			displayResult(temp);
//		}else {
//			System.out.println("can not add");
//		}
		
		//subtraction of two 2D array
//		int temp1[][] = obj.subtract2DArray(obj1);
//		if(temp!=null) {
//			System.out.println("Addition of two matrix");
//			displayResult(temp1);
//		}else {
//			System.out.println("can not add");
//		}
		
		
		//rotate array row-wise
//		obj.rowRotation(true,2);
//		System.out.println("Row - wise upward rotation");
//		obj.displayData();
//		obj.rowRotation(false,2);
//		System.out.println("Row - wise down-ward rotation");
//		obj.displayData();

		//rotate array column-wise
//		obj.columnRotation(true,2);
//		System.out.println("column - wise right rotation");
//		obj.displayData();
//		obj.columnRotation(false,2);
//		System.out.println("Row - wise left rotation");
//		obj.displayData();
		
		//transpose of matrix
//		int[][] temp5 = obj.transposeMAtrix();
//		System.out.println("Transpose is");
//		displayResult(temp5);
		
		//symmetric
//		boolean status = obj.isSymmetric();
//		if(status) {
//			System.out.println("Sysmmetric");
//		}else {
//			System.out.println("not symmetric");
//		}
		
		//identity
		boolean status = obj.isIdentity();
		if(status) {
			System.out.println("identity");
		}else {
			System.out.println("not identity");
		}
		
	}
	
	//to display result
	private static void displayResult(int[][] temp) {
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[i].length;j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
	}

}
