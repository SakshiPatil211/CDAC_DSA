package TwoD_Array;

public class Test2DArray {

	public static void main(String[] args) {
		My2DArray obj = new My2DArray();
		
		obj.acceptData();
		obj.displayData();
		
		int sumRow[] = obj.findSumRowwise();
		for(int i : sumRow) {
			System.out.print(i + " ");
		}
		System.out.println();
		int sumColumn[] = obj.findSumColumnwise();
		for(int i : sumColumn) {
			System.out.print(i + " ");
		}

	}

}
