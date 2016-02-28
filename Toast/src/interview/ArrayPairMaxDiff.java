package interview;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Given an array of integers, a, return the maximum difference of any pair of numbers such that the larger integer 
 * in the pair occurs at a higher index (in the array) than the smaller integer type of question...  
 * 
 * a=[1,4,6,7,4,7,89,4,3];
 */
public class ArrayPairMaxDiff {

	// brute force
	// Scan through all the array values and check the value less than the
	// current array value
	// - if yes, calculate the difference and see if it is maxmium than the
	// current maximum
	// - if no, move on to the next value in the array

	public int getMaxDiff(int[] a) {
		int length = a.length;
		int max = 0;
		for (int i = 0; i < length; ++i) {
			for (int j = i; j < length; ++j) {
				if (a[i] < a[j]) {
					int diff = a[j] - a[i];
					if (max < diff) {
						max = diff;
					}
				}
			}
		}
		return max;
	}

	// Another solution
	public int getMaxDiffAnother(int[] a) {
		int max = Integer.MIN_VALUE;
		int maxdiff = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			if (max < a[i])
				max = a[i];
			int diff = max - a[i];
			if (maxdiff < diff)
				maxdiff = diff;
		}

		return maxdiff;
	}

	@Test
	public void testGetMax() {
		int[] a = { -1, 4, 6, 7, 4, 7, 4, 3 };
		assertEquals(getMaxDiff(a), 8);
		assertEquals(getMaxDiffAnother(a), 8);
		int[] b = { 1, 2 };
		assertEquals(getMaxDiff(b), 1);
		assertEquals(getMaxDiffAnother(b), 1);
		int[] c = { 2, 1 };
		assertEquals(getMaxDiff(c), 0);
		assertEquals(getMaxDiffAnother(c), 0);

	}
}
