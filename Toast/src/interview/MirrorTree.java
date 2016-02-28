package interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class MirrorTree {

	class Node {
		Node left;
		Node right;
		int value;
		
		public Node(int value) {
			this.value=value;
		}
	}
	
	
	public Node mirrorTree(Node node) {
		if(node.left == null && node.right == null) {
			return null;
		}
		
		if(node.left !=null) {
			mirrorTree(node.left);
		}
		
		if(node.right !=null) {
			mirrorTree(node.right);
		}
		
		Node temp = node.right;
		node.right = node.left;
		node.left = temp;
		return node;
	}
	
	
	@Test
	public void testFunction(){
		Node n = new Node(1);
		Node nl = new Node(2);
		Node nr = new Node(3);
		n.left = nl;
		n.right = nr;
		Node nl1 = new Node(4);
		Node nr1 = new Node(5);
		//Node nl2 = new Node(6);
		Node nr2 = new Node(7);
		nl.left = nl1;
		nl.right = nr1;
		//nr.left = nl2;
		nr.right = nr2;
		Node result = mirrorTree(n);
		assertEquals(result.value,1);
		assertEquals(result.left.value,3);
		assertEquals(result.right.value,2);
		assertEquals(result.left.left.value,7);
		//assertEquals(result.left.right.value,6);
		assertEquals(result.right.left.value,5);
		assertEquals(result.right.right.value,4);
		
		
		
	}
}
