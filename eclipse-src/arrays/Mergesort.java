package arrays;

public class Mergesort {
	
	static int[] sort(int[] arr) {  //[1,5,3,7,2]
		int[] right = new int[arr.length/2];
		int[] left = new int[arr.length-right.length];
		for(int i=0;i<arr.length/2;i++) {
			right[i]=arr[i];
		}
		if(right.length>1) right =sort(right);
		else return arr;
		
		for(int i=0;i<left.length;i++) {
			left[i]=arr[i+right.length];
		}
		if(left.length>1) left =sort(left);
		else return arr;
		
		return merge(right,left);
	}
	static int[] merge(int[] right, int[] left) {
		 return right;
	}

	public static void main(String[] args) { 
		int[] arr= {1,5,3,7,2};
		sort(arr);
		

	}

}
