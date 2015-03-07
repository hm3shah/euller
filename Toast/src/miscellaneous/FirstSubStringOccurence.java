package miscellaneous;
import static org.junit.Assert.*;

import org.junit.Test;

public class FirstSubStringOccurence {
	
	@Test
	public void testIndexOf() {
		assertTrue(true);
		assertEquals(indexOf("foobar".toCharArray(), "oba".toCharArray()),2);
		assertEquals(indexOf("oooba".toCharArray(), "ooba".toCharArray()),1);
		assertEquals(indexOf("abc".toCharArray(), "bca".toCharArray()),-1);
	}

	public int indexOf(char[] mainstr, char[] substr) {

		// Edge cases are ignored
		int mainStrLength = mainstr.length;
		int subStrLength = substr.length;
		int count = subStrLength;
		int currentMainStrIndex = 0;
		int i=0,j=0;
		
		for (; i < subStrLength && j < mainStrLength;) {
			if (mainstr[j] == substr[i]) {
				++i;
				++j;
				--count;
			} else {
				i = 0;
				j = ++currentMainStrIndex;
				count = subStrLength;
			}
			if (count == 0) {
				return j - subStrLength;
			}
		}
		return -1;
	}
}
