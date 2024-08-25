package arrays;

public class SmallestNumber1 {

	public static void main(String[] args) {
		int x=81000;
		System.out.println(product(x));

	}

	private static int product(int x) {
		String s="";
		for(int i=9;i>=2;i--) {
			while(x%i==0) {
				s=i+s;
				x=x/i;
			}
		}
		if(x!=1) return -1;
		return Integer.parseInt(s);
	}

}
