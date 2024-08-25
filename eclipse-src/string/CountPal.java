package string;

public class CountPal {
	static int countP(String s) {
        int len = s.length(),count=0;
		String s2="";
		for(int i=0;i<len-1;i++) { //aaaaa
			for(int j=i+1;j<len;j++) {
			    s2=s2+s.substring(i,j+1)+" ";
			}
		}
		String[] s1 = s2.split(" ");
		for(int i=0;i<s1.length;i++){
		    int flag=0;
		    for(int j=0;j<s1[i].length()/2;j++){
		        char[] arr=s1[i].toCharArray();
		        if(arr[j]!=arr[arr.length-j-1]){
		            flag=1;
		            break;
		        }
		        if(flag==0) count++;
		    }
		}
		return count;
    }

	public static void main(String[] args) {
		String s="aaaaa";
		int c= countP(s);
		System.out.println(c);
	}

}
