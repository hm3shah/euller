package tree;

import org.junit.Test;
/**
 * Given a sorted linked list, create a binary tree with the array with minimum height
 */
import linkedlist.ReverseLinkedList.Node;

public class SortedListToBinaryTree {
	
	@Test
	public void test() {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next= new Node(4);
		node.next.next.next.next = new Node(5);
	}
	
	public TreeNode constructBinaryTreeFromList(Node node) {
		if(node ==null) {
			return null;
		}
		return null;
	}
}

