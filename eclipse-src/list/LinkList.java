package list;

public class LinkList {
	Node head;
	LinkList(int val){
		Node n = new Node(val);
		head=n;
	}
	LinkList(){
		
	}
	public class Node {
		int val;
		Node next=null;
		Node(int val){
			this.val=val;
		}
		Node(){}
	}
	
	public Node addFirst(int val) {
		//if(head==null) this.head.val = val;
		//else {
			Node n = new Node(val);
			n.next=head;
		 	head = n; 
		
		return head;	
	}
	
	public Node addLast(int val) {
		Node n = new Node(val);
		Node tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail.next=n;
		return head;
	}
	
	public Node addAt(int index, int val) {
		int ind=index-1;
		if(head==null || head.next==null) {
			addFirst(val);
			return head;
		}
		Node at = head;
		while(ind!=1) {
			at=at.next;
			ind--;
		}
		if(at.next==null) addLast(val);
		else {
			Node n = new Node(val);
			n.next=at.next;
			at.next=n;
		}
		return head;
	}
	void display() {
		Node i=head;
		while(i.next!=null) {
			System.out.println(i.val);
			i=i.next;
		}
		if(i.next==null) System.out.println(i.val);
	}
}
