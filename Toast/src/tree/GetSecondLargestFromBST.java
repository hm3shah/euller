package tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Get second largest from a BST with and without having the traverse
 * the whole tree
 * 
 * @author harshshah on Apr 12, 2015 @ 11:11:45 AM
 *
 */
public class GetSecondLargestFromBST {

	Node tree1;
	Node tree2;
	Node tree3;
	Node tree4;
	
	@Before
	public void createAndNodesToTree() {
		tree1 = new Node(5);
		tree1.left = new Node(3);
		tree1.right = new Node(7);
		//tree1.right.left= new Node(6);
		
		tree2 = new Node(7);
		tree2.left=new Node(5);
		tree2.left.left=new Node(4);
		tree2.left.left.left=new Node(2);
		
		tree3 = new Node(2);
		tree3.right = new Node(4);
		tree3.right.right=new Node(6);
		tree3.right.right.right= new Node(10);
		
		tree4 = new Node(5);
		tree4.left = new Node(3);
		tree4.right = new Node(7);
		tree4.left.right= new Node(4);
		
	}
	
	@Test
	public void testGetSecondLargestFromBst() {
		assertTrue(true);
		assertEquals(getSecondLargestFromBst(tree1),5);
		assertEquals(getSecondLargestFromBst(tree2),5);
		assertEquals(getSecondLargestFromBst(tree3),6);
		assertEquals(getSecondLargestFromBst(tree4),5);

		assertEquals(getSecondLargestSmart(tree1),5);
		assertEquals(getSecondLargestSmart(tree2),5);
		assertEquals(getSecondLargestSmart(tree3),6);
		assertEquals(getSecondLargestSmart(tree4),5);
	}
	
	private int getSecondLargestFromBst(Node root){
		List<Integer> bstArray = toArray(root);
		int arraySize = bstArray.size();
		return bstArray.get(arraySize-2);
	}

	private List<Integer> toArray(Node node) {
		if(node==null) {
			return null;
		}
		List<Integer> bstArrayList = new ArrayList<>();
		toArrayHelper(node,bstArrayList);
		return bstArrayList;
	}

	private void toArrayHelper(Node node, List<Integer> bstArrayList) {
		if(node==null) {
			return;
		} else {
			toArrayHelper(node.left,bstArrayList);
			bstArrayList.add(node.value);
			toArrayHelper(node.right, bstArrayList);
		}
	}
	
	private int getSecondLargestSmart(Node root) {
		if(root==null) {
			return -1;
		}
		if(root.left!=null && root.right==null) {
				return getLargest(root.left);
		} 
		if(root.right!=null && root.right.right==null && root.right.left==null) {//&& root.left==null 
				return root.value;
		}
		return (getSecondLargestSmart(root.right));
	}

	private int getLargest(Node root) {
		if(root.right!=null) {
			return getLargest(root.right);
		}
		return root.value;
	}
	
	/*
	 * 	private int getSecondLargestFromBstWithoutTraversing(Node root) {
		if(root==null) {
			return -1;
		}
		Node pre =null;
		Node max=root;
		
		while(max.right!=null) {
			pre=max;
			max=max.right;
		}
		
		if(pre==null) {
			if(max.left==null) {
				return -1;
			} else {
				return getRightMost(max.left);
			} 
		} else if(pre.left==null){
				return pre.value;
		} else {
			return getRightMost(pre);
		}
}

	private int getRightMost(Node node) {
		int max =0;
		while(node.right!=null) {
			node=node.right;
		}
		if(node.left!=null) {
			max=node.value;
			int temp = getRightMost(node.left);
			if(max<temp) {
				max=temp;
			}
			return max;
		}
		
		return node.value;
	}
	

	 */
}
