package tree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidBST {

	@Test
	public void testCheckVailidity() {
		ValidBST validBST = new ValidBST();
		TreeNode tree= null;
		assertTrue(validBST.checkVailidity(tree));					//4
		tree = new TreeNode(4);										//2			6
		tree.left = new TreeNode(2);							//1		3	5		7
		tree.right = new TreeNode(6);
		tree.left.left = new TreeNode(1);
		tree.left.right = new TreeNode(3);
		tree.right.right = new TreeNode(7);
		tree.right.left = new TreeNode(5);
		assertTrue(validBST.checkVailidity(tree));
	}
	
	private boolean checkVailidity(TreeNode tree) {
		return checkValidlty(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	//This algorithm runs in O(N) time, where N is the number of nodes of the binary tree. 
	//It also uses O(1) space (neglecting the stack space used by calling function recursively).
	
	private boolean checkValidlty(TreeNode tree, int minValue, int maxValue) {
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
