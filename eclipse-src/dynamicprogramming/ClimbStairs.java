package dynamicprogramming;

public class ClimbStairs {

	public static void main(String[] args) {
		int n=6;
		int[] dp=new int[n+1];
		System.out.println(climbTop(n,dp));

	}

	private static int climbTop(int n, int[] dp) {
		if(n==1 || n==2) return n;
		if(n==3) return 4;
		if(dp[n]!=0) return dp[n];
		int n1=climbTop(n-1,dp);
		int n2=climbTop(n-2,dp);
		int n3=climbTop(n-3,dp);
		dp[n]=n1+n2+n3;
		return n1+n2+n3;
	}

}
