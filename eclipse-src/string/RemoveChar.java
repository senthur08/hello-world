package string;

public class RemoveChar {

	public static void main(String[] args) {
		String s="aaagccc";
		removeCons(s,2);
		
	}

	private static void removeCons(String A,int B) {
		char[] arr = A.toCharArray();
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) count++;
            else count=1;
            if(count==B){
                int j=i+1;
                while(count!=0){
                    arr[j]=' ';
                    j--;
                    count--;
                }
            }
        }
        String[] s=new String(arr).split(" ");
        String s1="";
        for(int i=0;i<s.length;i++){
            s1+=s[i]; 
        }
        System.out.println(s1);
	}

}
