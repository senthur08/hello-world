package arrays;

public class BinSearch {
	private static int binSearch(int[] arr, int n) {
		int st=0,en=arr.length-1,mid=(st+en)/2;
		while(st<=en) {
			if(n==arr[mid]) return mid;
			else if(n>arr[mid]) {
				st=mid+1;
				mid=(st+en)/2;
			}
			else if(n<arr[mid]) {
				en=mid-1;
				mid=(st+en)/2;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		 int[] arr= {1,2,3,4,5,6,7,9};
		 int ind= binSearch(arr,1);
		 System.out.println(ind);
	}

}
