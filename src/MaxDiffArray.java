import static org.junit.Assert.*;

import org.junit.Test;


public class MaxDiffArray {

	public int maxDiff(int[] array) {
		if(array == null) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int a: array) {
			if(a < min) {
				min=a;
			}
			if(a > max) {
				max=a;
			}
		}
		return max -min;
	}
	
	
	@Test
	public void test() {
		int[] arr = {10, 15, 90, 200, 110};
		assertEquals(maxDiff(arr),190);
	}
}
