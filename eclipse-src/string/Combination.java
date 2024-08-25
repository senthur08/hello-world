package string;

public class Combination {
	
	static String strPermut(String s,int st,int en) { //incomplete
		char[] c=s.toCharArray();
		if(st==s.length()-1) return s;
		char temp = c[st];
		c[st]=c[en];
		c[en]=temp;
		System.out.println(new String(c));
		strPermut(new String(c),st+1,en);
		return s;
		
	}

	public static void main(String[] args) {
		String s="abc";
		strPermut(s,0,s.length()-1);

	}

}
