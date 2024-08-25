package dynamicprogramming;

public class FibTopDown {
	static int fibTop(int n, int[] dp) {
		if(n==1 || n==0) return n;
		if(dp[n]!=0) return dp[n];
		int nsum= fibTop(n-1,dp)+fibTop(n-2,dp);
		dp[n]=nsum;
		for(int i : dp) {
			System.out.print(i+" ");
		}
		System.out.println();
		return nsum;
	}

	public static void main(String[] args) {
		int[] dp=new int[10];
		System.out.println(fibTop(9,dp));
	}

}
