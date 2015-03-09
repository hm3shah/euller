package tree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidBST {

	@Test
	public void testCheckVailidity() {
		ValidBST validBST = new ValidBST();
		Node tree= null;
		assertTrue(validBST.checkVailidity(tree));					//4
		tree = new Node(4);										//2			6
		tree.left = new Node(2);							//1		3	5		7
		tree.right = new Node(6);
		tree.left.left = new Node(1);
		tree.left.right = new Node(3);
		tree.right.right = new Node(7);
		tree.right.left = new Node(5);
		assertTrue(validBST.checkVailidity(tree));
	}
	
	private boolean checkVailidity(Node tree) {
		return checkValidlty(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	//This algorithm runs in O(N) time, where N is the number of nodes of the binary tree. 
	//It also uses O(1) space (neglecting the stack space used by calling function recursively).
	
	private boolean checkValidlty(Node tree, int minValue, int maxValue) {
		if(tree == null) {
			return true;
		}
		if(tree.value > minValue && tree.value<maxValue) {
			return checkValidlty(tree.left,minValue,tree.value) && checkValidlty(tree.right, tree.value, maxValue);
		} else {
			return false;
		}
	}
}
