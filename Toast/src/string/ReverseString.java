package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseString {

	@Test
	public void testReverseGivenString() {
		assertTrue(true);
		assertEquals(reverseGivenString("abcd"),"dcba");
		assertEquals(reverseGivenString(""),"");
		assertEquals(reverseGivenString(null),null);
	}
	
	public String reverseGivenString(String str) {
		if(str==null) {
			return null;
		}
		StringBuilder reverseStr = new StringBuilder();
		int length = str.length();
		
		for(int i=length-1; i >= 0; --i) {
			reverseStr.append(str.charAt(i));
		}
		
		return reverseStr.toString();
	}
}
