package recursions;

public class Factorial {

	public static void main(String[] args) {
		int[] arr= new int[6];
		System.out.println(fact(5,arr));
		//printArr(arr,arr.length-1);
		
	}

	private static int fact(int i, int[] m) {
		if(i==1) return 1;
		int n=i*fact(i-1,m);
		m[i]=i;
		for(int j : m) {
			System.out.print(j+" ");
		}
		System.out.println();
		return n;
	}

	private static void printArr(int[] arr, int i) {
		if(i>0) printArr(arr,i-1);
		System.out.println(arr[i]);
		return;
		
	}

}
