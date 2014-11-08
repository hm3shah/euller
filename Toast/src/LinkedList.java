
public class LinkedList {

	Node n=null;
	
	public void add(int i) {
		if(n==null) {
			n = new Node();
			n.i=i;
			n.next=null;
		}
		
	}
	
	
	
}


class Node{
	int i;
	Node next;
	
	
}