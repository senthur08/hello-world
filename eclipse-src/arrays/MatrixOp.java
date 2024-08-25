package arrays;

public class MatrixOp {
	static void transpose(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<i;j++) {
				 int temp=arr[i][j];
				 arr[i][j]=arr[j][i];
				 arr[j][i]=temp;
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},
					  {4,5,6,7},
					  {7,8,9,0},
					  {5,6,3,1}};
		transpose(arr);

	}

}
