package list;

import java.util.HashMap;

public class Hash {
	public static void findIntersection(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                int val = map.get(A[i])+1;
                map.replace(A[i],val);
            }
            else{
               map.put(A[i],1);
            }
        }
        for(int i=0;i<B.length;i++){
            if(map.containsKey(B[i])){
                if(i==B.length-1) System.out.print(B[i]);
                else System.out.print(B[i]+" ");
            }
        }
    }

	public static void main(String[] args) {
		int[] arr1= {1,1,2,2,2,3,3,4};
		int[] arr2= {1,1,2,2,3,4,5};
		findIntersection(arr1,arr2);
	}

}
