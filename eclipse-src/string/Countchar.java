package string;

public class Countchar {
	
	static void countVowel(String s) {  //ascii diff = 32
		char[] arr={'a','e','i','o','u'};
		int count=0;
		for(int i=0; i<s.length();i++) {
			for(int j=0;j<arr.length;j++) {
				if(s.charAt(i)==arr[j] || s.charAt(i)==(char)(arr[j]-32)) count++;
			}
		}
		 System.out.println(count);
	}
	static void maxVowel(String s) {
		String[] arr={"a","e","i","o","u"};
		int count=0,sum=0,ind=-1;
		for(int i=0;i<arr.length;i++) {
			count = s.length()-s.replaceAll(arr[i],"").length();
			if (sum<count) { 
				sum=count;
				ind=i;
			}
		}
		if(ind>=0) System.out.println(arr[ind]);
	}
	
	static void countDig(String s) { //ascii value of digit 0 =48
		String s1="";
		for(int i=0; i<s.length();i++) {
			if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=58) s1+=s.charAt(i);
		}
		System.out.println(s1);
	}
	
	static void countChar(String s) {
		String s1="";
		int count=1;
		for(int i=0;i<s.length();i++) {
			if((i<s.length()-1 && s.charAt(i)!=s.charAt(i+1)) || i==s.length()-1) {
				s1=s1+s.charAt(i)+count;
				count=1;
			}
			else if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				count++;
				continue;
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		String s= "Success";
		//countVowel(s);
		//maxVowel(s);
		//countDig(s);
		countChar(s);
	}

}
