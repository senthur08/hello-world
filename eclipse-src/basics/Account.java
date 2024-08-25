package basics;

public class Account {
	int bal;
    static int interest=10;
    void init(int bal){
        this.bal=bal/2;
        //System.out.println(Account.interest);
    }
    void display(){
    	 //System.out.println(Account.interest);
    	 System.out.println(this.bal);
    }

	public static void main(String[] args) {
	    Account a1 = new Account();
	    a1.init(5); 
	    Account a2 = a1;
        a2.display();
        String s="madam";
        System.out.println(s.substring(0,5));
	}

}
