package string;

public class Palindrome {
	static boolean basicPal(String s) {  
		int len=s.length();
		boolean b=true;
		if(len<2) return false;
		for(int i=0;i<len/2;i++) {
			 if(s.charAt(i)!=s.charAt(len-i-1)) {
				 b=false;
				 break;
			 }
		 }
		 return b;
	}
	static String[] palSubstrings(String s) {
		int len = s.length();
		String s2="";
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				
				//if(basicPal(s.substring(i,j+1))) s2=s2+s.substring(i,j+1)+" ";
				
				s2=s2+s.substring(i,j+1)+" ";
			}
		}
		return s2.split(" ");
	}
	
	static int countPal(String[] s1) {
		int count=0;
		for(int i=0;i<s1.length;i++){
		    int flag=0,ind=0;
		    for(int j=0;j<s1[i].length()/2;j++){
		        char[] arr=s1[i].toCharArray();
		        if(arr[j]!=arr[arr.length-j-1]){
		            flag=1;
		            break;
		        }
		        if(flag==0) System.out.println(s1[i]);
		    }
		}
		return count;
	}

	public static void main(String[] args) {
		//Palindrome p = new Palindrome();
		String s="aaaaa";
		//if(basicPal(s)) System.out.println("yes");
		//else System.out.println("no");
		String[] s1=palSubstrings(s);
		/*for (String str : s1){
			System.out.println(str);
		}*/
		int c=countPal(s1);
		
	}

}
