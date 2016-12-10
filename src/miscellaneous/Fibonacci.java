package miscellaneous;
import static org.junit.Assert.*;

import org.junit.Test;

public class Fibonacci {

	@Test
	public void testRecursiveFib() {
		assertTrue(true);
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0, fibonacci.recursiveFib(0));
		assertEquals(1, fibonacci.recursiveFib(1));
		assertEquals(1, fibonacci.recursiveFib(2));
		assertEquals(2, fibonacci.recursiveFib(3));
		assertEquals(21, fibonacci.recursiveFib(8));
		assertEquals(144, fibonacci.recursiveFib(12));
	}
	
	@Test
	public void testIterativeFib() {
		assertTrue(true);
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0, fibonacci.iterativeFib(0));
		assertEquals(1, fibonacci.iterativeFib(1));
		assertEquals(1, fibonacci.iterativeFib(2));
		assertEquals(2, fibonacci.iterativeFib(3));
		assertEquals(21, fibonacci.iterativeFib(8));
		assertEquals(144, fibonacci.iterativeFib(12));
	}

	private int iterativeFib(int i) { // 0, 1, 1, 2, 3, 5, 8, 13
		int temp[] = new int[i + 1];
		if (i == 0 || i == 1) {
			return i;
		} else {
			temp[0] = 0;
			temp[1] = 1;
			for (int j = 2; j <= i; j++) {
				temp[j] = temp[j - 1] + temp[j - 2];
			}
		}
		return temp[i];
	}

	private int recursiveFib(int i) {
		if (i == 0) {
			return 0;
		} else if (i == 1) {
			return 1;
		} else {
			return recursiveFib(i - 1) + recursiveFib(i - 2);
		}
	}
}
