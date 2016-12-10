package interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindANumberInSortedArray {
	
	
	public int findANumber(int[] a, int n) {
		if(a == null ) {
			return -1;
		}
		int l =0;
		int r =a.length -1;
		
		while(l<r) {
			int m = (l + r)/2;
			if(a[m] == n ) {
				return m;
			} else if(a[m] < n && n < a[r]) {
				l=m+1;
			} else {
				r = m-1;
			}
		}
		return -1;
	}

	
	@Test
	public void test() {
		//assertEquals(findANumber(new int[]{1,2,3,4},3),2);
		assertEquals(findANumber(new int[]{4,1,2,3},3),3);
		
	}
}
