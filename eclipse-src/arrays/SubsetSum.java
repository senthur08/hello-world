package arrays;

import java.util.Arrays;
//prob statement:- subsets should be unique
public class SubsetSum {
	private static void threeSum(int[] arr, int tar) {
		Arrays.sort(arr);//[1,1,2,2,3,4,7,8,8]
		for(int i=0;i<arr.length-2;i++) {
			if(i!=0 && arr[i]==arr[i-1]) continue;
			int j=i+1, k=arr.length-1;
			while(j<k) {
				while(j<k && arr[j]==arr[j-1]) j++;
				while(k>j && arr[k]==arr[k-1]) k--;
				if(tar-arr[i] == arr[j]+arr[k]) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					j++;
					k--;
				}
				else if(arr[j]+arr[k]>tar) {
					k--;
				}
				else {
					j++;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,2,4,7,8,1,2,3,8};
		threeSum(arr,12);
	}

}
