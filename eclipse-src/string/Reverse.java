package string;

public class Reverse {
	static String recurseRev(String s) {
		int len= s.length();
		if(len==1) return s;
		return s.charAt(s.length()-1)+recurseRev(s.substring(0,len-1));
	}
	static void rev(String s) {
		char[] ar= s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j) {
			char temp = ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
		System.out.println(new String(ar ));
	}
	
	static void sentRev(String s) {
		String s1="";
		int i=0, j=0;
		while(i<s.length()) {
			if(j<s.length()-1 && s.charAt(j)==' ') {
				s1=s1+recurseRev(s.substring(i,j))+" ";
				i=j+1;
			}
			if(j==s.length()-1) {
				s1+=recurseRev(s.substring(i,j+1));
				break;
			}
			j++;
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		String s="I love you";
		// rev(s);
		//String res=recurseRev(s);
		sentRev(s);
	}

}
