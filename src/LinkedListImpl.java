
public class LinkedListImpl {

	private Node head;
	
	public void add(int i) {
		Node temp = new Node(i);
		if(head == null) {
			head = temp;
		}
		else {
			temp.next=head;
			head=temp;
		}
	}
	
	public void reverseList(Node currentNode) {
		if (currentNode.next==null)	{
			head = currentNode;
		} else {
			reverseList(currentNode.next);
			currentNode.next.next=currentNode;
			currentNode.next=null;
		}
	}
	
	public void printList() {
		if(head==null) {
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value + "-->");
			temp=temp.next;
		}
			
	}
	
	class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		LinkedListImpl linkedList = new LinkedListImpl();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.printList();
	}
}


