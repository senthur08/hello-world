package basics;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		int[] arr= { 2,3,4,641,281,262,359,173};
		ArrayList<Integer> l1 = primeno(arr);
		
	}

	private static ArrayList<Integer> primeno(int[] A) {
		ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<A.length;i++){
            int flag=0;
            for(int j=2;j<A[i];j++){
                if(A[i]%j==0) flag++;
            }
            if(flag>0) list.add(A[i]);
        }
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        return list;
	}

}
