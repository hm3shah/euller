package linkedlist;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class ReverseLinkedList {

	public class Node {
	
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	@Test
	public void testReverseLinkedList(){
		Node testNode= new Node(3);
		testNode.next= new Node(4);
		testNode.next.next = new Node(5);
		Node reverse=reverseLinkedList(testNode);
		assertEquals(reverse.data,5);
	}

	private Node reverseLinkedList(Node testNode) {
		if(testNode == null || testNode.next == null) {
			return testNode;
		}
		Node temp = reverseLinkedList(testNode.next);
		testNode.next.next=testNode;
		return temp;
	}
	
	public static void main(String[] args) {
		Queue<Integer> testQueue = new LinkedList<>();
		testQueue.isEmpty();
	}
}
