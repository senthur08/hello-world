package list;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkList l= new LinkList(20);
		l.addFirst(10);
		l.addLast(30);
		l.addAt(2, 5);
		l.display();
		//LinkedList<Integer> l1= new LinkedList<>();
		
	}

}
