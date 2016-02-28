package tree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Given the inorder and preorder traversal of a BST reconstruct the tree
 * @author harshshah
 * 
 */
public class ReconstructTree {

	int[] inOrder;
	int[] preOrder;
	
	@Before
	public void init() {
		inOrder= new int[]{2,3,4,5,6,7,8};
		preOrder=new int[]{5,3,2,4,7,6,8};
	}
	
	@Test
	public void testReconstructTreeGivenInorderandPreorder() {
		assertTrue(true);
		TreeNode root = reconstructTreeGivenInorderandPreorder(inOrder,preOrder);
		assertEquals(root.value,5);
		assertEquals(root.left.value,3);
		assertEquals(root.right.value,7);
		assertEquals(root.left.right.value,4);
		assertEquals(root.left.left.value,2);
		assertEquals(root.right.left.value,6);
		assertEquals(root.right.right.value,8);
	}

	public TreeNode reconstructTreeGivenInorderandPreorder(int[] in, int[] pre) {
		return reconstructTree(in,pre,0,in.length-1,0,pre.length-1);
	}

	private TreeNode reconstructTree(int[] in, int[] pre, int inStart, int inEnd, int preStart,int preEnd) {
		if(inStart>inEnd || preStart > preEnd) {
			return null;
		}
		TreeNode root = new TreeNode(pre[preStart]);
		int k = findValue(inOrder,pre[preStart]);
		root.left=reconstructTree(in,pre,inStart,k-1,preStart+1,preStart+k-inStart);
		root.right=reconstructTree(in, pre, k+1, inEnd, preStart + k -inStart+1, preEnd);
		return root;
	}

	private int findValue(int[] inOrder2, int k) {
		for(int i=0; i< inOrder2.length; ++i) {
			if (inOrder2[i]==k) {
				return i;
			}
		}
		return -1;
	}
	

}
