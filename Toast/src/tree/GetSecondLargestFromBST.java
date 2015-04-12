package tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Get second largest from a BST
 * @author harshshah
 *
 */
public class GetSecondLergestFromBST {

	Node tree1;
	Node tree2;
	Node tree3;
	
	@Before
	public void createAndNodesToTree() {
		tree1 = new Node(5);
		tree1.left = new Node(3);
		tree1.right = new Node(7);
		tree1.right.left= new Node(6);
		
		tree2 = new Node(7);
		tree2.left=new Node(5);
		tree2.left.left=new Node(4);
		tree2.left.left.left=new Node(2);
		
		tree3 = new Node(2);
		tree3.right = new Node(4);
		tree3.right.right=new Node(6);
		tree3.right.right.right= new Node(10);
	}
	
	@Test
	public void testGetSecondLargestFromBst() {
		assertTrue(true);
		assertEquals(getSecondLargestFromBst(tree1),6);
		assertEquals(getSecondLargestFromBst(tree2),5);
		assertEquals(getSecondLargestFromBst(tree3),6);
	}
	
	public int getSecondLargestFromBst(Node root){
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
}
