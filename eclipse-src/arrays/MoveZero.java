package arrays;

public class MoveZero {
	static int[] swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {3,5,0,0,4,0,7,8}; //[0,0,3,1,0,7,0]
		int i=0,j=0;
		while(i<arr.length && j< arr.length){
			if(arr[i]!=0) {
				i++;
				j++;
				continue;
			}
			if(arr[j]==0) {
				j++;
				continue;
			}
			arr=swap(arr,i,j);
			i++;
			j++;
		}
		for (int k:arr) {
			System.out.print(k+" ");
		}
	}

}
