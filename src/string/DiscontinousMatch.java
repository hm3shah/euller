package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscontinousMatch {

	@Test
	public void testDiscontinousMatch() {
		assertEquals(discontinuousMatch("cat", "cat"), 1);
		assertEquals(discontinuousMatch("cat", "catapult"), 3);
		assertEquals(discontinuousMatch("cat", "ca"), 0);
		assertEquals(discontinuousMatch("cat", "catcat"), 4);
	}

	private int discontinuousMatch(String pattern, String str) {
		return discontinuousMatch(pattern, str, 0, 0);
	}

	private int discontinuousMatch(String pattern, String str, int patternIndex, int strIndex) {
		if (patternIndex == pattern.length()) {
			return 1;
		} else if (strIndex == str.length()) {
			return 0;
		} else {
			int count = 0;
			for (int i = strIndex; i < str.length(); ++i) {
				if (pattern.charAt(patternIndex) == str.charAt(i)) {
					count += discontinuousMatch(pattern, str, patternIndex + 1,i + 1);
				}
			}
			return count;
		}
	}
}