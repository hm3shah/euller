package tree;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PostOrderTraversal {
	
	class Node {
		Node right;
		Node left;
		int value;
		public Node(int v) {
			this.value=v;
		}
	}

	 public List<Integer> postorderTraversal(Node root) {
		 List<Integer> result = new ArrayList<>();
		 return postorderTraversalHelp(root,result);
	 }

	private List<Integer> postorderTraversalHelp(Node root, List<Integer> result) {
		if (root == null ) {
			return result;
		}
		postorderTraversalHelp(root.left,result);
		postorderTraversalHelp(root.right, result);
		result.add(root.value);
		return result;
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
		
		List<Integer> result = postorderTraversal(n);
		for(Integer i : result) {
			System.out.println(i);
		}
	}
}
