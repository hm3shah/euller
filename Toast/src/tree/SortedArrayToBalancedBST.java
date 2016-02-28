package tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedArrayToBalancedBST {

	@Test
	public void testArrayToBalancedBST() {
		TreeNode testTemp = arrayToBalancedBST(new int[]{1,2,3,4,5,6});
		assertEquals(testTemp.value,3);
		assertEquals(testTemp.left.value,1);
		assertEquals(testTemp.left.right.value,2);
		assertEquals(testTemp.right.value,5);
		assertEquals(testTemp.right.left.value,4);
		assertEquals(testTemp.right.right.value,6);
	}
	
	public TreeNode arrayToBalancedBST(int[] inputArray) {
		return arrayToBalancedBST(inputArray,0,inputArray.length-1);
	}

	public TreeNode arrayToBalancedBST(int[] inputArray, int i, int j) {
		if(i > j) {
			return null;
		} else if( i == j) {
			return new TreeNode(inputArray[i]);
		} else {
			int mid = i + (j-i)/2;
			TreeNode temp = new TreeNode(inputArray[mid]);
			temp.left = arrayToBalancedBST(inputArray,i,mid-1);
			temp.right = arrayToBalancedBST(inputArray,mid+1,j);
			return temp;
		}
	}
}
