package list;

import java.util.Collections;
import java.util.PriorityQueue;

public class PrQueue {
	static int kthSmallest(int[] arr,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int i=0;
		while(i<k) {
			pq.add(arr[i]);
			i++;
		}
		while(i<arr.length) {
			if(arr[i]<pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
			i++;
		}
		return pq.remove();
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6 };
		System.out.println(kthSmallest(arr,3));
	}

}
